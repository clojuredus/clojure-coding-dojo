(ns diehard.core-test
  (:require [clojure.test :refer :all]
            [diehard.core :refer [compute-shopping-cart]]))

(deftest ein-buch-im-warenkorb
  (testing "Ein Buch gibt keinen Rabatt"
    (let [cart [1 0 0 0 0]]
      (is (= 12 (compute-shopping-cart cart))))))
