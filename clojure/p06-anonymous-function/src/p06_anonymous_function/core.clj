;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#anonymous-function

(ns p06-anonymous-function.core)

(defn -main
  "Main"
  []
  (fn [] (println "Hello world"))
  (def hello-world-func (fn [] (println "Hello world")))
  (fn [] (+ 1 1))
  #(+ 1 1) ; same as the above
  #(+ 1 %)
  (let [plus #(+ 1 %)]
    (println (plus 10)))
  (let [plus-numbers #(+ 1 %1 %2 %3)]
    (println (plus-numbers 10 20 30)))
  (def say-hello (fn [name] (println (str "Hello, " name))))
  (def say-bye (fn [name] (println (str "Good bye, " name))))
  (def greeting (fn [greeting-func name] (greeting-func name)))
  (greeting say-hello "Kim")
  (greeting say-bye "Kim")
)
