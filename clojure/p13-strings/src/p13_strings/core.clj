;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#strings

(ns p13-strings.core)

(defn -main
  "Main"
  []
  (println "Hi, there!") ; a literal

  (println (str "Good " "morning")) ; 'str' concats
  ; (println  (+ "Good " "morning")) ; '+' does not concat
  (let [first "Hirokuni"
        last "Kim"]
    (println (str "My name is " first " " last)))

  (println (format "My favorite fruit is %s" "apple")) ; 'format' is like sprintf
  (println (format "I ate %d apples" 2))
  (println (format "Pi: %.3f" 3.14159265))
  (println (format "Pi: %.5f" 3.14159265))
  (println (format "Boolean representation of 1: %b" 1))
  (println (format "Boolean representation of nil: %b" nil))
  )
