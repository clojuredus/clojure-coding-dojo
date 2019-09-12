(defproject rover "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [myguidingstar/clansi "1.3.0"]]
  :plugins [[com.jakemccrary/lein-test-refresh "0.24.1"]
            [nightlight/lein-nightlight "2.4.2"]]
  :main rover.console)
