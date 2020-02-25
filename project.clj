(defproject secure-msg "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :main helloworld.core

  :cljsbuild
   {:builds
     [
      {:id "dev"
       :source-paths ["src/cljs"]
       ;:figwheel true
       :compiler
       {:optimizations :none
        :output-to "resources/public/javascripts/dev.js"
        :output-dir "resources/public/javascripts/cljs-dev/"
        :pretty-print true
        :source-map true}}
      {:id "prod"
        :source-paths ["src/cljs"]
        ;:figwheel true
        :compiler
        {:optimizations :advanced
         :output-to "resources/prod/javascripts/dev.js"
         :output-dir "resources/prod/javascripts/cljs-dev/"
         :pretty-print true
         :source-map "resources/prod/javascripts/dev.js.map"}}]}

  :plugins [[lein-cljsbuild "1.1.7"]]

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.10.597"]
                 [reagent "0.9.1"]])
