(defproject rover "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/test.check "0.9.0"]
                 [myguidingstar/clansi "1.3.0"]]
  :plugins [[com.jakemccrary/lein-test-refresh "0.19.0"]
            [nightlight/lein-nightlight "1.9.3"]]
  :main rover.console)
