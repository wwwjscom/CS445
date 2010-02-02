all: build run

build:
	mkdir bin
	javac -d bin/ src/hw1/*.java

run:
	java -cp ${CLASSPATH}:bin/ hw1/WalletTest

clean:
	rm bin/hw1/*.class
