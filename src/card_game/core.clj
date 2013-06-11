(ns card-game.core
  (:require [clojure.math.combinatorics :as combo]))

(defn calculate-average 
  [n k a]
  (apply + 
    (for [num (combo/combinations a k)]
      (mod (first (sort > num)) 1000000007))))
