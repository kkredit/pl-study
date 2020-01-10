#!/bin/bash

set -e

URL="$(curl -s https://golang.org/dl/ | grep "linux-amd64.tar.gz" | head -1 | cut -d\" -f4)"
FILE="$(echo $URL | rev | cut -d/ -f1 | rev)"
INST_DIR=/usr/local

echo "Downloading $URL..."
wget -q --show-progress $URL
echo "Untarring $FILE into $INST_DIR..."
sudo tar -C $INST_DIR -xzf $FILE
rm $FILE

if echo $PATH | grep -v "go/bin" &>/dev/null; then
    echo "Adding $INST_DIR/go/bin to ~/.profile..."
    echo "export PATH=\$PATH:$INST_DIR/go/bin" >> ~/.profile
    echo "Run 'export PATH=\$PATH:$INST_DIR/go/bin'"
fi
