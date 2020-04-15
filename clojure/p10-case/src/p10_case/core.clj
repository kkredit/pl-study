;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#case

(ns p10-case.core)

(defn case-test-1
  [n]
  (case n
     1 "n is 1"
     2 "n is 2"
     "n is other"))
    ;; Case options must be compile-time literals https://clojuredocs.org/clojure.core/case

(defn -main
  "Main"
  []
  (println (case-test-1 1))
  (println (case-test-1 2))
  (println (case-test-1 3))
  )
