;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#sets

(ns p17-sets.core
  (:use [clojure.set]))

(defn -main
  "Main"
  []
  (println #{1 2 3})
  ; (println #{1 2 3 3}) ; IllegalArgumentException Duplicate key: 3
  (println (conj #{1 2 3} 4))
  (println (conj (conj #{1 2 3} 4) 4)) ; there is only one 4 in the result
  (println (disj #{1 2 3} 1))
  (println (disj #{1 2 3} 4))
  (println (sort (conj #{1 2 3} 4)))
  (println (contains? #{1 2 3} 1))
  (println (clojure.set/subset? #{1 2} #{1 2 3 4}))
  (println (clojure.set/superset? #{1 2 3} #{1 2}))
  (println #{1 2 'a})
  )
