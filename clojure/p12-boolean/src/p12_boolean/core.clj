;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#boolean

(ns p12-boolean.core)

(defn -main
  "Main"
  []
  (println true)
  (println false)
  (println (boolean false)) ;
  (println (boolean nil))   ; Only 'false' and 'nil' evaluate to false
  (println (boolean 0))
  (println (boolean 1))
  (println (boolean "hi there"))
  (println (boolean :hi))
  )
