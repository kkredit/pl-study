;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#vectors

(ns p16-vectors.core)

(defn -main
  "Main"
  []
  (println [1 2 3])
  (println (conj [1 2 3] 4)) ; unlike lists, 'conj' adds to the back
  (println (nth [1 2 3] 1))
  (println (first [1 2 3]))
  (println (second [1 2 3]))
  ; (println (third [1 2 3])) ; third is not a thing
  (println (.indexOf [1 2 3] 2))
  (println (.indexOf [1 2 3] 4)) ; returns -1; yuck! Give me options!
  (println [1 2 'a]) ; objects do not need to be of the same type
  )
