(ns secureMsg.core
  (:require [reagent.core :as reagent]))

(def app-state
  (reagent/atom
    {:message "Hello from App State!"}))

(defn app []
  [:h1 (:message @app-state)])

(reagent/render [app] (js/document.querySelector "#root"))
