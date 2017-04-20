(ns gilded-rose.core
  "Results of the Coding Dojo from the Clojure Meetup Düsseldorf.
   Mode: Randori
   Time: ~2 hours")

(defn expired? [item]
  (neg? (:sell-in item)))

(defn quality-increase [item amount]
  (update item :quality + amount))

(defn quality-decrease [item amount]
  (update item :quality - amount))

(defn quality-reset [item]
  (assoc item :quality 0))

(defn age-item [item]
  (if (= "Sulfuras, Hand of Ragnaros" (:name item))
    item
    (update item :sell-in dec)))

;; -----------------------------------------------------------------------------
;; Items

(defmulti update-item :name)

(defmethod update-item "Backstage passes to a TAFKAL80ETC concert" [item]
  (cond
    (< 4 (:sell-in item) 10) (quality-increase item 2)
    (< -1 (:sell-in item) 5) (quality-increase item 3)
    (expired? item) (quality-reset item)
    :else (quality-increase item 1)))

(defmethod update-item "Aged Brie" [item]
  (if (< (:quality item) 50)
    (quality-increase item 1)
    item))

(defmethod update-item "+5 Dexterity Vest" [item]
  (if (expired? item)
    (quality-decrease item 2)
    (quality-decrease item 1)))

(defmethod update-item "Elixir of the Mongoose" [item]
  (if (expired? item)
    (quality-decrease item 2)
    (quality-decrease item 1)))

(defmethod update-item :default [item] item)

;; -----------------------------------------------------------------------------

(def change-quality update-item)

(defn update-quality [items]
  (map (comp change-quality age-item) items))

(defn item [item-name, sell-in, quality]
  {:name item-name, :sell-in sell-in, :quality quality})

(defn update-current-inventory[]
  (let [inventory
        [(item "+5 Dexterity Vest" 10 20)
         (item "Aged Brie" 2 0)
         (item "Elixir of the Mongoose" 5 7)
         (item "Sulfuras, Hand Of Ragnaros" 0 80)
         (item "Backstage passes to a TAFKAL80ETC concert" 15 20)]]
    (update-quality inventory)))


