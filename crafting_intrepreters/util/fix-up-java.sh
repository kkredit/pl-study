#!/bin/bash

# Remove whitespace
sed -i 's/[ \t]*$$//' $@

# Remove unicode
# TODO: not working!
# CHARS=$(python -c 'print u"\u200E".encode("utf8")')
# sed -i 's/['"$CHARS"']//g' $@
# iconv -c -f utf-8 -t ascii $@

# Update VSCodium
# TODO: