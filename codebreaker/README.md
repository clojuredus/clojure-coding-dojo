# codebreaker

This kata is based on
[Interactive Development with clojure.spec](http://blog.cognitect.com/blog/2016/10/5/interactive-development-with-clojurespec).

> "We want a function that accepts a secret code and a guess, and returns a
> score for that guess. Codes are made of 4 to 6 colored pegs, selected from six
> colors: [r]ed, [y]ellow, [g]reen, [c]yan, [b]lack, and [w]hite. The score is
> based on the number of pegs in the guess that match the secret code. A peg in
> the guess that matches the color of the peg in the same position in the secret
> code is considered an exact match, and a peg that matches a peg in a different
> position in the secret code is considered a loose match.

> For example, if the secret code is `[:r :y :g :c]` and the guess is `[:c :y :g
> :b]`, the score would be `{:codebreaker/exact-matches 2
> :codebreaker/loose-matches 1}` because `:y` and `:g` appear in the same
> positions and `:c` appears in a different position."

Try to spec your code with clojure.spec. The
official [spec Guide](https://clojure.org/guides/spec) is always a good choice
to be kept open in a separate window.

First, the data-structure should be specced. After this, use
[s/fdef](https://clojure.org/guides/spec#_spec_ing_functions)
to spec all your functions (you can / should try to spec them **first** and
*then* implement them!).

Specs can also be used for
[validation at runtime](https://clojure.org/guides/spec#_using_spec_for_validation).
You can use [s/valid?](https://clojuredocs.org/clojure.spec/valid_q) for
verification.
