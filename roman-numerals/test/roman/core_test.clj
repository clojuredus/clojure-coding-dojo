(ns roman.core-test
  (:require [clojure.test :refer :all]
            [roman.core :refer [convert]]))

(deftest one-is-I
  (is (= "I" (convert 1))))
