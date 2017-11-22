# Mars Rover Kata Clojure

*The Java-version of this code is taken from
[vfarcic/mars-rover-kata-java](https://github.com/vfarcic/mars-rover-kata-java)
and converted to a Clojure project. Based on
[Java Tutorial Through Katas: Mars Rover](http://technologyconversations.com/2014/10/17/java-tutorial-through-katas-mars-rover/).*

## Description

Develop an API that moves a rover around on a grid.

* You are given the initial starting point [x, y] of a rover, the direction
  (:north, :south, :east, :west) it is facing and the current world.
* The rover receives a string of commands, e.g. "l" (left), "lfl" (left,
  forward, left).
* Implement commands that turn the rover left / right.
* Implement commands that move the rover forward / backward.
* Implement wrapping from one edge of the grid to another. (planets are spheres
  after all)
* Implement obstacle detection before each move to a new square.

Description based on: [Dallas Hack Club](http://dallashackclub.com/rover).

Graphical visualization based on [stianeikeland/rover-clj](https://github.com/stianeikeland/rover-clj)

## Implementation

Recommended approach to solve this kata is by using TDD.

## Running

The game has a graphical representation. To start it, type `lein run`.

Run the tests with `lein test` or automatically with `lein test-refresh`
