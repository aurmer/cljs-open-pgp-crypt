(ns secureMsg.core
  (:require [reagent.core :as reagent]
            [secureMsg.title :refer (header)]))

(def app-state
  (reagent/atom
    {:message "Hello from App State!"}))

(defn app []
  [:div {:class "container"}
   [header (:message @app-state)]])

(reagent/render [app] (js/document.querySelector "#root"))
