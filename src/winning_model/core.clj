(ns winning-model.core
  (:require
   [winning-model.data.loader :as data-loader]
   [winning-model.config.loader :as config-loader])
  (:gen-class))

(defn -main
  [profile]
  (let [{:keys [parameters]} (config-loader/config profile)
        cifar                (data-loader/cifar (:batch-size parameters))]
    (println parameters)))
