#!/bin/bash

alias run='lein run'
alias new='nc'

function nc() {
    cd $(git rev-parse --show-toplevel)/clojure
    NAME=$1
    UNDER_NAME=${NAME//-/_}
    HYPHN_NAME=${UNDER_NAME//_/-}

    # PREFIX="00"
    for i in `seq -w 0 99`; do
        if ! ls | grep -q $i; then
          PREFIX="$i"
          break
        fi
    done
    CLOJ_NAME="p${PREFIX}-${HYPHN_NAME}"
    JAVA_NAME=${CLOJ_NAME//-/_}

    lein new $CLOJ_NAME
    cd $CLOJ_NAME
    rm -rf CHANGELOG.md doc/ LICENSE README.md resources/ test/

    PROJECT_FILE=project.clj
    cat > $PROJECT_FILE <<EOF
(defproject $CLOJ_NAME "0.1.0-SNAPSHOT"
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
  "Main"
  []
  (println "Hello, World!")
  )
EOF
    codium $SOURCE_FILE
}
