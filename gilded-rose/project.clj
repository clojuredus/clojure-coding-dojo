(defproject gilded-rose "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha16"]
                 [org.clojure/test.check "0.9.0"]]
  :plugins [[com.jakemccrary/lein-test-refresh "0.19.0"]]
  :main ^:skip-aot gilded-rose.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
