#!/bin/bash

function nh() {
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

    FILE=$PREFIX-$NAME.hs
    cat > $FILE <<EOF
-- Original author Miran Lipovaca
-- Modifications by Kevin Kredit
-- Licensed under https://creativecommons.org/licenses/by-nc-sa/3.0/

-- http://learnyouahaskell.com/$NAME

module Main
  where

main = putStrLn "This file meant to be loaded in GHCI"

EOF

    git add $FILE
    codium $FILE
}
