(ns tiny-maze.solver
  "Example:
  [[:S 0  1]
   [1  0  1]
   [1  0 :E]]

  - :S : start of the maze
  - :E : end of the maze
  - 1 : This is a wall that you cannot pass through
  - 0 : A free space that you can move through.")

(defn solve-maze [maze])
