;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#scope

(ns p03-scope.core)

(defn -main
  "Main"
  []
  (let [a "aaa"]
    (println a))
  (let [a "aaa"]
    (let [a "AAA"]
      (println a)))
  (let [a "aaa"]
    (let [a "AAA"]
      (println a))
    (println a))
  (let [a "a"]
    (let []
      (println a))))
  ; (let [a "a"]
  ;   (let []
  ;     (println not-bound-symbol)))) ; Exception: Unable to resolve symbol
