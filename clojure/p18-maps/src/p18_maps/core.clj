;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#maps

(ns p18-maps.core)

(defn -main
  "Main"
  []
  (println {:Apple "Mac" :Microsoft "Windows"})
  (println {"Apple" "Mac" "Microsoft" "Windows"})
  (println (get {:Apple "Mac" :Microsoft "Windows"} :Apple))
  (println (get {:Apple "Mac" :Microsoft "Windows"} :Linux))
  (println (get {:Apple "Mac" :Microsoft "Windows"} :Linux "Sorry, no Linux"))
  (println (:Apple {:Apple "Mac" :Microsoft "Windows"}))
  (println (:Linux {:Apple "Mac" :Microsoft "Windows"} "Sorry, no Linux"))
  (println (assoc {:Apple "Mac" :Microsoft "Windows"} :Commodore "Amiga"))
  (println (assoc {:Apple "Mac" :Microsoft "Windows"} :Apple "iOS"))
  (println (merge {:Apple "Mac" :Microsoft "Windows"} {1 2}))
  (println (keys {:Apple "Mac" :Microsoft "Windows"}))
  (println (vals {:Apple "Mac" :Microsoft "Windows"}))
  )
