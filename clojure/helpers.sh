#!/bin/bash

function nc() {
    NAME=$1

    PREFIX="00"
    for i in `seq -w 1 99`; do
        if ls | grep $i &>/dev/null; then
            continue
        else
            PREFIX="$i"
            break
        fi
    done

    FILE=$PREFIX-$NAME.clj
    cat > $FILE <<EOF
// Original author Hirokuni Kim
// Modifications by Kevin Kredit
// Licensed under https://www.apache.org/licenses/LICENSE-2.0

// https://kimh.github.io/clojure-by-example/#$NAME

EOF
    codium $FILE
}