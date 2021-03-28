(ns winning-model.config.loader
  (:import
   [clojure.lang PersistentHashMap])
  (:require
   [clojure.string :as string]))

(defn ^PersistentHashMap config
  [profile]
  (let [profile (if (string/blank? profile)
                  profile
                  (str "-" profile))
        path (str "./resources/config/application" profile ".edn")]
    (-> path
        slurp
        read-string)))
