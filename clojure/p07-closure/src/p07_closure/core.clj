;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#closure

(ns p07-closure.core)

(defn inner
  [from-outer]
  (fn [] (println from-outer)))

(defn -main
  "Main"
  []
  (def outer1 (inner "this is from outer"))
  (def outer2 (inner "this is yet another from outer"))
  (outer1)
  (outer2)
  )
