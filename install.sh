if [ "$EUID" -ne 0 ]
  then echo "Please run as root"
  exit
fi
chmod +x installfile/devito
cp installfile/devito /usr/bin/
cp installfile/main.py installfile/runDevito.py
mv installfile/runDevito.py /usr/bin/
