;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#recur

(ns p21-recur.core)

(defn fibo-recursive [n]
  (if (or (= n 0) (= n 1))
    n
    (+ (fibo-recursive (- n 1)) (fibo-recursive (- n 2)))))

(defn fibo-recur [iteration]
  (let [fibo (fn [one two n]
    (if (= iteration n)
      one
      (recur two (+ one two) (inc n))))]
    ;; 0N 1N are bigint literals. See Bigint section
    ;; We need to use bigint to avoid StackOverflow to do the addition of big Fibonacci numbers
    ;; demonstrated below.
    (fibo 0N 1N 0)))

; (defn fibo-loop-recur [current next iteration]
;   (if (= 0 iteration)
;   current
;   (+ 0
;     (recur next (+ current next) (dec iteration)))))
  ; ^^ CompilerException java.lang.UnsupportedOperationException: Can only recur from tail position

(defn count-down [result n]
  (if (= n 0)
    result
    (recur (conj result n) (dec n))))

(defn -main
  "Main"
  []
  (println (fibo-recursive 0))
  (println (fibo-recursive 6))
  (println (fibo-recur 6))

  ; (println (fibo-recursive 100000)) ; StackOverflowError
  (println (fibo-recur 100000)) ; no stack overflow, just slow

  (println (count-down [] 5))
  )
