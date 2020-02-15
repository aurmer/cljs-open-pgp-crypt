(ns express-app
  (:requre ["express"]))

(defn start-server []
  (println "Starting server")
  (let [app (express)]
    (.get app "/" (fn [req res] (.send res "Hello, World!")))
    (.listen app 3000 (fn [] (println "Express server listening on port 3000!!!")))))
; (def app require('./config/express')) ;needs to be a js call

(defn start! []
  (reset! server (start-server)))

(defn restart! []
  (.close @server start!))

(set! *main-cli-fn* start!)
