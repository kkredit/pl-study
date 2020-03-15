#!/bin/bash

function mergewith() {
    STR="$2"
    for ELEM in "${@:3}"; do
        STR="${STR}${1}${ELEM}"
    done
    echo $STR
}

function nr() {
    PREFIX=${1//./_} # the number
    NAME=$(mergewith "-" ${@:2})
    URI=$(mergewith "/" ${@:2})

    FILE=$PREFIX-$NAME.rs
    cat > $FILE <<EOF
/* Original source by the Rust Team
 * Modifications by Kevin Kredit
 * Licensed under https://www.apache.org/licenses/LICENSE-2.0
 *
 * https://doc.rust-lang.org/stable/rust-by-example/$URI.html
 */

EOF
    git add $FILE
    codium $FILE
}

function run() {
    LATEST=bin/$(ls -1t bin | head -1)
    echo "RUNNING $LATEST:"
    echo
    ./$LATEST
}
