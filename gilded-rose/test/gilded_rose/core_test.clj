(ns gilded-rose.core-test
  (:require [clojure.test :refer [deftest testing is are]]
            [clojure.spec.test :as stest]
            [gilded-rose.core :as rose]))

(rose/update-current-inventory)

(def test-output [{:name "+5 Dexterity Vest", :sell-in 9, :quality 19}
                  {:name "Aged Brie", :sell-in 1, :quality 1}
                  {:name "Elixir of the Mongoose", :sell-in 4, :quality 6}
                  {:name "Sulfuras, Hand Of Ragnaros", :sell-in -1, :quality 80}
                  {:name "Backstage passes to a TAFKAL80ETC concert", :sell-in 14, :quality 21}])

(deftest update-quality
  (testing "Testing update-quality"
    (is (= test-output (rose/update-current-inventory)))))

(deftest update-quality2
  (testing "something useful"
    (let [test-input [{:name "Backstage passes to a TAFKAL80ETC concert"
                       :sell-in 0
                       :quality 10}]]
      (is (= (rose/update-quality-legacy test-input)
             (rose/update-quality test-input))))))

(deftest testing-change-quality
  (testing "test quality"
    (let [test-input {:name "Backstage passes to a TAFKAL80ETC concert"
                      :sell-in 1
                      :quality 10}]
      (is (= (:quality (rose/change-quality test-input))
             13)))))

