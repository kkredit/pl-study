# Makefile for building a single directory of Java source files. It requires
# a DIR variable to be set.

BUILD_DIR := build

SOURCES := $(wildcard $(DIR)/com/pl-study/$(PACKAGE)/*.java)
CLASSES := $(addprefix $(BUILD_DIR)/, $(SOURCES:.java=.class))

JAVA_OPTIONS := -Werror

default: remove_whitespaces $(CLASSES)
	@: # Don't show "Nothing to be done" output.

# Remove trailing whitespaces that the website introduces
remove_whitespaces: $(SOURCES)
	@ sed -i 's/[ \t]*$$//' $(SOURCES)

# Compile a single .java file to .class.
$(BUILD_DIR)/$(DIR)/%.class: $(DIR)/%.java
	@ mkdir -p $(BUILD_DIR)/$(DIR)
	@ javac -cp $(DIR) -d $(BUILD_DIR)/$(DIR) $(JAVA_OPTIONS) -implicit:none $<
	@ printf "%8s %-60s %s\n" javac $< "$(JAVA_OPTIONS)"

.PHONY: default remove_whitespaces
