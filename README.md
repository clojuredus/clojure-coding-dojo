# Clojure Meetup Düsseldorf 

Here is a collection of katas to learn the Clojure programming language.

All projects need [Leiningen](https://leiningen.org/#install).

At first, it might be a good start to check out the [ClojureScript
Koans](http://clojurescriptkoans.com/), where you can interactively test out
Clojure / ClojureScript and get familiar with the syntax.

After this, you can use the katas from this repository or browser
[exercism.io](http://exercism.io/languages/clojure/about) to get more exercises.

## Start hacking

#### Auto-Test

We try to keep all projects up to date. Currently, they are all equipped with
[lein test-refresh](https://github.com/jakemcc/lein-test-refresh) which can be
used to automatically execute the tests when you changed a file. Your IDE /
Editor might have the same feature, like `cider-auto-test-mode`. Start lein
test-refresh with the command

    lein test-refresh

#### Embedded IDE

The projects also are shipped with the embedded editor
[Nightlight](https://sekao.net/nightlight/). This is a Web-IDE, which runs
directly in your code. It is available as a Leiningen-Plugin and you can start
it with

    lein nightlight

Navigate to http://localhost:4000 and start hacking with an IDE and the
InstaREPL.

#### Project Descriptions

All projects have their own descriptions with some hints to solve them. Make
sure to read their README-files.
