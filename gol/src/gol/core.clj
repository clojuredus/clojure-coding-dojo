(ns gol.core
  (:require  [clojure.spec :as s]))

(defn rule
  "Gets the neighbor count and whether the cell is alive, 
   returns 0 iff the cell should die."
  [ncount alive?])

(defn compute-neighbor-count
  "Computes the number of alive neighbors for a cell. 
    Input dependes on the representation you choose."
  [ ,,, ])

(defn compute-next-generation
  "Computes the next generation. 
   Input dependes on the representation you choose."
  [ ,,, ])


