;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#macros

(ns p23-macros.core)

(defmacro unless [test then]
  "Evaluates then when test evaluates to be falsey"
  (list 'if (list 'not test)
   then))

; (defmacro unless [test then]
; "Evaluates then when test evaluates to be falsey"
; (list if (list not test)
;   then))
  ; ^^ CompilerException java.lang.RuntimeException: Unable to resolve symbol: if in this context
  ; must use quotes in macro definitions

(defn -main
  "Main"
  []
  (unless false (println "false!!"))
  (println (macroexpand '(unless false (println "hi"))))

  (println '(dec (inc 1))) ; ' quotes prevent evaluation
  (println `(dec (inc 1))) ; ` backticks are like ' but return fully-qualified namespaces
  (println '(+ 1 ~(inc 1))) ; ~ is unquoting; ' does not expand the ~
  (println `(+ 1 ~(inc 1))) ; ` _does_ expand the ~

  (println `(+ ~(list 1 2 3)))
  (println `(+ ~@(list 1 2 3))) ; ~@ "splices" the sequence into the enclosing syntax-quoted data structure

  ;; ~@ occuring prior to evaluation is like runtime C preprocessor macros. Talk about code-as-data!
  )
