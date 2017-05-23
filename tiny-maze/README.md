# tiny-maze

*Taken from [wonderland-clojure-katas](https://github.com/gigasquid/wonderland-clojure-katas/tree/master/tiny-maze)*

Alice found herself very tiny and wandering around Wonderland.  Even
the grass around her seemed like a maze.

![alice tiny](/images/alicetiny.gif)

This is a tiny maze solver.

A maze is represented by a matrix

```clojure
[[:S 0 1]
 [1  0 1]
 [1  0 :E]]
```

- _S_ : start of the maze
- _E_ : end of the maze
- _1_ : This is a wall that you cannot pass through
- _0_ : A free space that you can move through.

The goal is the get to the end of the maze.  A solved maze will have a
_:x_ in the start, the path, and the end of the maze, like this.

```clojure
[[:x :x 1]
 [1  :x 1]
 [1  :x :x]]
```


## Instructions

- Run the tests with `lein test` or automatically with `lein test-refresh`
- Make the tests pass!


## License

Copyright © 2014 Carin Meier

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
