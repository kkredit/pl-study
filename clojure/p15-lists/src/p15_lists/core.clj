;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#lists

(ns p15-lists.core)

(defn -main
  "Main"
  []
  (println '(1 2 3))
  ; (println (1 2 3)) ; Error, it tries to evaluate '1' as a function:
                      ; ClassCastException java.lang.Long cannot be cast to clojure.lang.IFn
  (println (conj '(1 2 3) 4)) ; conj adds (to the front), but there is no built-in removal
  (println (nth '(1 2 3) 1))
  (println (count '(1 2 3) ))
  (println '(1 2 'a)) ; objects do not need to be of the same type
  )
