;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#sequences

(ns p19-sequences.core)

(defn -main
  "Main"
  []
  (println (map inc [ 1 2 3 ]))
  (println (map inc `( 1 2 3 )))
  (println (map inc #{ 1 2 3 }))
  (println (map key {:a 1 :b 2 :c 3}))

  (println (seq '(1 2 3)))
  (println (seq [1 2 3]))
  (println (seq #{1 2 3}))
  (println (seq {:a 1 :b 2 :c 3}))
  (println (type (seq [1 2 3])))

  (println (first [1 2 3]))
  (println (first "string"))
  (println (rest [1 2 3]))

  (println (type [1 2 3]))
  (println (type (rest [1 2 3]))) ; Sequence functions all return sequences
  (println (cons 0 '(1 2))) ; add to head

  (println (def old-seq '(1 2)))
  (println (def new-seq (cons 0 old-seq)))
  (println old-seq)
  (println new-seq)

  (println (concat '(1 2 3) '(4 5 6)))
  (println (concat '(1 2) '(4 5) '(7 8) '(9 10)))
  (println (map inc [ 1 2 3 ]))
  (println (map (fn [x] (inc (val x))) {:a 1 :b 2 :c 3}))

  (println (reduce + [1 2 3 4]))
  ; (println (reduce inc [1 2 3 4])) ; ArityException Wrong number of args (2) passed to: core/inc
  (println (reduce (fn [res val] (+ res val)) [1 2 3 4]))
  (println (reduce + -10 [1 2 3 4]))

  (println (into [1 2 3] `(4 5 6))) ; insert elements of 2nd into 1st
  (println (into [] `(1 2 3))) ; often used to change seq types
  (println (into (list) [1 2 3]))
  (println (into #{} [1 2 3]))
  (println (into [] #{1 2 3}))
  (println (into {} [[:a 1] [:b 2] [:c 3]]))
  (println (into [] {:a 1 :b 2 :c 3}))

  (println (reverse [1 2 3]))
  ; (println (iterate + 0)) ; runs forever without a 'take'! Lazy evaluation-esque
  (println (range 5 10))
  (println (range 0 100 5))
  (repeatedly 5 (fn [] (println "hi!")) )
  (doseq [animal ["cat" "dog" "horse"]] (println animal) )
  (doseq [n1 [1 2 ]
          n2 [4 5 ]]
    (println (+ n1 n2)))

  (println (take 5 (range 0 100)))
  (println (take 10 (range 0 5)))
  (println (take 5 (iterate + 0))) ; 'take' version of previous example
  (println (take 5 (iterate inc 0)))
  (println (take-while neg? [-3 -2 -1 0 1 2 3]))
  (println (drop 5 (range 0 10)))
  (println (drop-while neg? [-3 -2 -1 0 1 2 3]))
  (println (filter pos? [-1 2 3]))
  (println (filter (fn [v] (= v 2)) [-1 2 3]))
  (println (remove pos? [-1 -2 3 4]))

  (println (partition-by #(< 3 %) [1 2 3 4 5 6]))
  (println (partition-by #(< 3 %) [1 2 3 4 5 6 1 2 3]))
  (println (group-by #(< 3 %) [1 2 3 4 5 6 1 2 3]))
  )
