# Gilded Rose Kata in Clojure

Based on
[mjansen401/gilded-rose-clojure](https://github.com/mjansen401/gilded-rose-clojure).

## Description

"Hi and welcome to team Gilded Rose. As you know, we are a small inn with a
prime location in a prominent city ran by a friendly innkeeper named Allison. We
also buy and sell only the finest goods. Unfortunately, our goods are constantly
degrading in quality as they approach their sell by date. We have a system in
place that updates our inventory for us. It was developed by a no-nonsense type
named Leeroy, who has moved on to new adventures. Your task is to add the new
feature to our system so that we can begin selling a new category of items.
First an introduction to our system:

* All items have a `:sell-in` value which denotes the number of days we have to sell
  the item
* All items have a `:quality` value which denotes how valuable the item is
* At the end of each day our system lowers both values for every item

Pretty simple, right? Well this is where it gets interesting:

* Once the sell by date has passed, Quality degrades twice as fast
* The Quality of an item is never negative
* “Aged Brie” actually increases in Quality the older it gets
* The Quality of an item is never more than 50
* “Sulfuras”, being a legendary item, never has to be sold or decreases in
  Quality
* “Backstage passes”, like aged brie, increases in Quality as it’s `:sell-in`
  value approaches; Quality increases by 2 when there are 10 days or less and by
  3 when there are 5 days or less but Quality drops to 0 after the concert

We have recently signed a supplier of conjured items. This requires an update to our system:

* "Conjured" items degrade in Quality twice as fast as normal items

Feel free to make any changes to the `update-quality` function and add any new
code as long as everything still works correctly. However, do not alter the
`item` function as it belongs to the goblin in the corner who will insta-rage
and one-shot you as he doesn't believe in shared code ownership.

Just for clarification, an item can never have its quality increase above 50,
however "Sulfuras" is a legendary item and as such its quality is 80 and it
never alters.

Original Source (clojurified):
[iamnotmyself.com](http://iamnotmyself.com/2011/02/13/refactor-this-the-gilded-rose-kata/)

## Testing

For automatic testing on each code change, we added the Leiningen plugin
`lein-test-refresh`. Execute the following command in your project's root
directory:

    lein test-refresh

## Specs

The goblin is a badass one-shotter, but specced the `item` function in `specs.clj`.
