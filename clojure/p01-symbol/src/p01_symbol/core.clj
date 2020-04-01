;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#symbol

(ns p01-symbol.core)

(defn -main
  "Main"
  []
  (do
    (println (type 'a))
    (println (type 'b))
    (println (type 'my-cool-function))
    (println (type 'nyncat))
    (println (def a "aaaaa"))
    (println a)))
    ; (println b))) -- Exception!
