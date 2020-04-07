;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#if

(ns p09-if.core)

(defn positive-number [numbers]
  (if-let [pos-nums (not-empty (filter pos? numbers))]
    pos-nums
    "no positive numbers"))

(defn -main
  "Main"
  []
  (if true
    (println "This branch is take if predicate evaluates to 'true'")
    (println "This branch is take if predicate evaluates to 'false'"))
  (if true
    (do
    (println "one")
    (println "two")))

  (println (positive-number [-1 -2 1 2]))
  (println (positive-number [-1 -2]))
  (println (boolean (filter pos? [-1])))
  (println (not-empty [1 2]))
  (println (not-empty []))

  (when-let [pos-nums (filter pos? [ -1 -2 1 2])]
    pos-nums
    (println "one")
    (println "two"))
  )
