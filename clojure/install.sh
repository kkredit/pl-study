#!/bin/bash

sudo apt-get install -y \
  curl \
  rlwrap

wget -q https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein
chmod +x lein
mv ~/bin/ lein

which java || sudo apt-get install -y default-jdk

curl -O https://download.clojure.org/install/linux-install-1.10.1.536.sh
chmod +x linux-install-1.10.1.536.sh
sudo ./linux-install-1.10.1.536.sh
rm ./linux-install-1.10.1.536.sh
