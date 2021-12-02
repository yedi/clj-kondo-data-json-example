(ns clj-kondo-data-json-example.core
  (:require
   [clojure.data.json :as json]))

(extend-type java.sql.Timestamp
  json/JSONWriter
  (-write [date out options]
    (json/-write (str date) out options)))