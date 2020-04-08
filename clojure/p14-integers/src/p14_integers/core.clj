;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#integers

(ns p14-integers.core)

(defn power
  [x n]
  (reduce * (repeat n x)))

(defn -main
  "Main"
  []
  (println (+ 2 3)) ; basically everything is as expected
  (println (- 10 3))
  (println (* 10 2))
  (println (/ 4 2))
  (println (/ 4 3)) ; fractions represented by ratio
  (println (mod 3 2))
  (println (max 1 2 3 4 5))
  (println (min 5 4 3 2 1))
  (println (power 2 3))
  (println (+ (bigint Long/MAX_VALUE) 10)) ; bigint is for very large numbers
  ; (println (+ 9223372036854775807 10))   ; --> will overflow
  (println (+ 9223372036854775807N 10N))   ; the N suffix is for bigint literals
  )
