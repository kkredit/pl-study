;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#functions

(ns p05-functions.core)

(defn say-hello
  [name]
  (println (str "Hello, " name)))

(defn say-hello2
  "Takes name argument and say hello to the name"
  [name]
  (println (str "Hello, " name)))

(defn say-hello3
  "Takes name argument and say hello to the name"
  {:added "1.0"
    :static true}
  [name]
  (println (str "Hello, " name)))

(defn -main
  "Main"
  []
  (say-hello "Kim"))
  ;; The following work from a repl
  ; (doc say-hello2)
  ; (meta (var say-hello3))
  ; (meta #'say-hello3)) ; same as line above
