(ns roman.core-test
  (:require [clojure.test :refer [deftest is run-all-tests]]
            [roman.core :refer [convert]]))

(deftest one-is-I
  (is (= "I" (convert 1))))
