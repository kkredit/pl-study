;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#namespaces

; (import java.util.Date) ; Or, the more efficient version below

(ns p08-namespaces.core
  (:import [java.util Date]))

(defn -main
  "Main"
  []
  (create-ns 'clojure.by.example)
  (in-ns 'clojure.by.example)
  (defn favorite-language [] "Clojure!!")
  (println (favorite-language))
  (in-ns 'p08-namespaces.core)
  (println (favorite-language)) ; Works, because namespace is nested?
                                ; Should fail I think, with "Error: Unable to resolve symbol"
                                ; see https://kimh.github.io/clojure-by-example/#require
  (println (new Date))
  )
