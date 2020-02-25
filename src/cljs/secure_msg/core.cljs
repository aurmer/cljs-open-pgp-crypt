(ns secureMsg.core
  (:require [reagent.core :as reagent]))

(defn app []
  [:h1 {:class "title"} "Hello from a Clojure data structure... not JSX... WOW"])

(reagent/render [app] (js/document.querySelector "#root"))
