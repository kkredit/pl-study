;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#threading-macros

(ns p24-threading-macros.core)

(defn -main
  "Main"
  []
  (println (conj (conj (conj [] 1) 2) 3))

  ;; -> the
  (println (-> []
              (conj 1)
              (conj 2)
              (conj 3)))
  (println (->> ["Japan" "China" "Korea"]
              (map clojure.string/upper-case)
              (map #(str "Hello " %))))
  )
