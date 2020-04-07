;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#cond

(ns p11-cond.core)

(defn cond-test
  [n]
  (cond
    (= n 1) "n is 1"
    (and (> n 3) (< n 10)) "n is over 3 and under 10"
    :else "n is other"))

(defn condp-test-2
  [n]
  (condp contains? n
    #{1 2 3} "n is either 1 or 2 or 3"
    "n is not 1 or 2 or 3"))

(defn -main
  "Main"
  []
  (println (cond-test 1))
  (println (cond-test 5))
  (println (cond-test 15))

  (println (condp-test-2 2))
  (println (condp-test-2 5))
  )
