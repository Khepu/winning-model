(defproject winning-model "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :mirrors {"maven-restlet" {:url "https://maven.restlet.org"}}

  :dependencies [[org.clojure/clojure "1.10.0"]

                 ;;dl4j
                 [org.nd4j/nd4j-cuda-10.1                "1.0.0-beta7"]
                 [org.deeplearning4j/deeplearning4j-core "1.0.0-beta7"]
                 [org.deeplearning4j/deeplearning4j-ui   "1.0.0-beta7"]

                 ;;logging
                 [org.slf4j/slf4j-api "1.7.30"]
                 [org.slf4j/slf4j-simple "1.7.30"]]

  :main ^:skip-aot winning-model.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
