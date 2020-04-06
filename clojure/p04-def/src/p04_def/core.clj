;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#def

(ns p04-def.core)

(defn -main
  "Main"
  []
  (def object "light")
  (println (str "God said let there be " object))
  (def object "darkness")
  (println (str "God said let there be " object)))
