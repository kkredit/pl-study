#!/bin/bash

function nc() {
    NAME=$1
    UNDER_NAME=${NAME//-/_}
    HYPHN_NAME=${UNDER_NAME//_/-}

    # PREFIX="00"
    for i in `seq -w 0 99`; do
        ls | grep -q $i || (PREFIX="$i"; break)
    done
    CLOJ_NAME="p${PREFIX}-${HYPHN_NAME}"
    JAVA_NAME=${CLOJ_NAME//-/_}

    lein new $PROJ_NAME
    cd $PROJ_NAME
    rm -rf CHANGELOG.md doc/ LICENSE README.md resources/ test/

    PROJECT_FILE=project.clj
    cat > $PROJECT_FILE <<EOF
(defproject $PROJ_NAME "0.1.0-SNAPSHOT"
  :description "Clojure-by-example program for $NAME"
  :url "https://kimh.github.io/clojure-by-example/#$NAME"
  :license {:name "Apache License, Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main $CLOJ_NAME.core)
EOF

    SOURCE_FILE=src/$JAVA_NAME/core.clj
    cat > $SOURCE_FILE <<EOF
;; Original author Hirokuni Kim
;; Modifications by Kevin Kredit
;; Licensed under https://www.apache.org/licenses/LICENSE-2.0
;; See https://kimh.github.io/clojure-by-example/#$NAME

(ns $CLOJ_NAME.core)

(defn -main
  "I can say 'Hello World'."
  []
  (println "Hello, World!"))
EOF
    codium $SOURCE_FILE
}
