;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#for

(ns p20-for.core)

(defn -main
  "Main"
  []
  (println (for [x '(1 2 3)]
              (+ 10 x)))

  (println (for [x '(-1 1 2) :when (< 0 x)]
              x))

  (println (for [x [0 1 2 3 4 5]
                 :let [y (* x 3)]
                 :when (even? y)]
              y))

  (println (for [x (range 10) :while (not= x 5)]
              x))

  (println (for [x ['a 'b 'c]
                 y [1 2 3]]
             [x y]))
  )
