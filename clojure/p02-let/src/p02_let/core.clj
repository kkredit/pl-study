;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#let

(ns p02-let.core)

(defn -main
  "Main"
  []
  (do
    (let [l "light"] (println (str "God said let there be " l)))
    ; (println l) -- Exception!
    (let [l "light"
          d "darkness"]
      (println (str "God said let there be " l))
      (println (str "God also said let there be " d)))
    (let [l "light"
          l_d (str l " and" " darkness")]
      (println (str "God also said let there be " l_d)))))
