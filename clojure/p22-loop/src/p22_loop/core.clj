;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#loop

(ns p22-loop.core)

(defn count-up [max]
  (loop [count 0]
    (if (= count max)
      (println "Done!")
      (do
        (println (str "Counting " count))
        (recur (inc count))))))

(defn count-up-no-loop [count max]
  (if (= count max)
    (println "Done!")
    (do
      (println (str "Counting " count))
      (recur (inc count) max))))

(defn -main
  "Main"
  []
  (println (count-up 5))
  (println (count-up-no-loop 0 5))
  )
