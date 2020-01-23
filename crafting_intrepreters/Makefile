BUILD_DIR := build

default: jlox

# Create the Python environment and install packages into it.
setup:
	@ python3 -m venv util/env
	@ ./util/env/bin/pip install -r util/requirements.txt

# Remove all build outputs and intermediate files.
clean:
	@ rm -rf $(BUILD_DIR)
	@ rm -rf gen

# Compile the Java interpreter .java files to .class files.
jlox:
	@ $(MAKE) -f util/java.make DIR=java PACKAGE=lox

.PHONY: setup clean default jlox
