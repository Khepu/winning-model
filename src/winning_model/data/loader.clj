(ns winning-model.data.loader
  (:import
   [org.deeplearning4j.datasets.iterator.impl Cifar10DataSetIterator])
  (:gen-class))

(defn ^Cifar10DataSetIterator cifar
  [batch-size]
  (new Cifar10DataSetIterator batch-size))
