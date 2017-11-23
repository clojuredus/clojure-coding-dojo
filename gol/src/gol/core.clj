(ns gol.core
  (:use [quil.core])
  (:require [clojure.spec.alpha :as s]))

;; forward declaration, the functions are at the bottom of the file
(declare start-simulation start-rendering world-height world-width element-at)

(def blinker
  [[0 1 0 0]
   [0 1 0 0]
   [0 1 0 0]])

(def glider
  [[0 0 0 1 0 0 0 0 0 0 0]
   [0 1 0 1 0 0 0 0 0 0 0]
   [0 0 1 1 0 0 0 0 0 0 0]
   [0 0 0 0 0 0 0 0 0 0 0]
   [0 0 0 0 0 0 0 0 0 0 0]
   [0 0 0 0 0 0 0 0 0 0 0]
   [0 0 0 0 0 0 0 0 0 0 0]
   [0 0 0 0 0 0 0 0 0 0 0]
   [0 0 0 0 0 0 0 0 0 0 0]
   [0 0 0 0 0 0 0 0 0 0 0]])


(defn rule
  "Gets the neighbor count and whether the cell is alive,
   returns 0 iff the cell should die."
  [ncount alive?]
  alive?)


(defn compute-neighbor-count
  "Computes the number of alive neighbors for the cell at position x y"
  [world [x y]]
  0)

(defn update-world
  "Computes the next generation."
  [world]
  world)

(comment
  ;; Visualisierung anzeigen
  (start-rendering)
  ;; Simulation anhalten
  (stop-simulation)
  ;; Simulation starten
  (start-simulation glider) 
  )


;; ---- HELPER FUNCTIONS


(defn world-width [world]
  (count (nth world 0)))


(defn world-height [world]
  (count world))

(defn element-at
  "Returns the element at the given position.
  If the position is outside the array it will return
  0, marking dead space."
  [world [x y]]
  (if (or (< x 0)
          (< y 0)
          (>= x (world-width world))
          (>= y (world-height world)))
    0 ;; respect array bounds
    (nth (nth world y) x)))












;; ---- VISUALIZATION
;; taken from https://github.com/adcloud/clojure-intro-workshop

(def rendered-w (atom [[1 0]
                       [0 1]]))

;; This serves as the thread that runs the endless simulation loop.
(def simulation-running (agent false))
(def simulation-sleep-ms (atom 600))
(def fps (atom 60))

(defn simulate
  "Executes the side effect of changing the rendered-w to the next state
  calculated by update-world.
  Also resends itself to the agent to create a endless loop.
  Can be stopped by setting simulation-running to false.
  Use stop-simulation for this."
  [running]
  (when running
    (try
      (swap! rendered-w update-world) ; Side effect! assign new state
      (Thread/sleep @simulation-sleep-ms)
      (send *agent* simulate) ; Trigger the loop
      true ; This is the new value for simulation-running
      (catch Exception e
        (println "Caught exception during simulation press <enter> to proceed.")
        (.printStackTrace e)
        (println "To restart the simulation simply call
                 (start-simulation <world_value>) again.")
        false)))) ; In case of an exception stop the loop

(defn start-simulation
  "Starts to simulate the world in a seperate thread.
  Displays the result in the GUI.
  Call stop-simulation to stop it."
  [w]
  (reset! rendered-w w)
  (send simulation-running (constantly true))
  (send simulation-running simulate))

(defn stop-simulation
  "Stops the simulation loop."
  []
  (send simulation-running (constantly false)))

(defn display-world
  "Displays the given world in the GUI.
  Also stops the simulation."
  [w]
  (stop-simulation) ; Side effect
  (reset! rendered-w w))


;; Called only once
;; ----------------------------------------------------------------------------
(defn setup []
  (smooth)
  (frame-rate @fps)
  (background 0)) ;; Black background

;; Called for each frame
;; ----------------------------------------------------------------------------
(defn draw []
  (stroke 0)
  (stroke-weight 0)
  (let [tile-width (/ (width) (world-width @rendered-w))
        tile-height (/ (height) (world-height @rendered-w))]
    (dorun  ;; Force immediate evaluation of lazy sequence
     (for [x (range (world-width @rendered-w))
           y (range (world-height @rendered-w))]
       (do  ;; We do our drawing side-effects here
         ;; Set fill based on cell alive state
         (fill (* 255 (element-at @rendered-w [x y])))
         ;; Draw a rect for each cell
         (rect (* x tile-width) (* y tile-height)
               tile-width tile-height))))))


;; Main function
;; ----------------------------------------------------------------------------
(defn start-rendering []
  ;; This is Quil starting a drawing cycle.
  (defsketch example
    :title "Game of Life"
    :setup setup
    :draw draw
    :size [(max 200 (* (world-width  @rendered-w) 15)),
           (max 200 (* (world-height @rendered-w) 15))]))
