(ns rover.console
  (:require [rover.core :as rover]
            [clansi.core :refer [style]]))

(def terrain {:X (style "#" :yellow)
              :_ " "
              :north (style "Λ" :red :blink-slow :bright)
              :south (style "V" :red :blink-slow :bright)
              :west (style "<" :red :blink-slow :bright)
              :east (style ">" :red :blink-slow :bright)})

(defn print-map [game]
  (let [world (assoc-in (:world game) (:position game) (:direction game))]
    (doseq [row (mapv (partial map terrain) world)]
      (println (apply str row)))))

(defn play [game]
  (try (loop [game game]
         (print-map game)
         (println "Where do you want to move? Available commands: l, r, f, b, q")
         (let [input (read-line)]
           (when-not (= input "q")
             (recur (rover/execute game input)))))
       (catch Exception e
         (print-map (ex-data e))
         (println (style (.getMessage e) :red)))))

(defn- gen-row [length]
  (mapv (fn [_] (rand-nth [:_ :_ :_ :X])) (range length)))

(defn new-game [height length]
  (let [start-pos [(/ height 2) (/ length 2)]
        raw-world (mapv (fn [_] (gen-row length)) (range height))
        world     (assoc-in raw-world start-pos :_)]
    {:world world
     :direction :north
     :position start-pos}))

(defn play-game []
  (play (new-game 24 80)))

(defn -main []
  (play-game))
