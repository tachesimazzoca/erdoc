.PHONY: all 
all: compile

.PHONY: compile
compile:
	@mvn compile

.PHONY: test 
test:
	@mvn test 

.PHONY: run 
run:
	@mvn exec:java

.PHONY: package
package:
	@mvn package

.PHONY: javadoc
javadoc:
	@mvn javadoc:javadoc

.PHONY: checkstyle
checkstyle:
	@mvn checkstyle:checkstyle

.PHONY: clean
clean:
	@mvn clean
