#!/bin/bash

function ng() {
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

    FILE=$PREFIX-$NAME.go
    cat > $FILE <<EOF
// Original author Mark McGranaghan
// Modifications by Kevin Kredit
// Licensed under https://creativecommons.org/licenses/by/3.0/

// https://gobyexample.com/$NAME

EOF
    codium $FILE
}