NAME = AvajLauncher
EXEC = java
CC = javac
FLAG = -cp
SRCS = ./src -name "*.java"

$(NAME)	: compile run

compile:
	@ find ./src -name "*.java" > src.txt
	@ mkdir -p out
	@ $(CC) -d out @src.txt

run:
	@ $(EXEC) -classpath out src/Main.java scenario.txt

clean:
	@ rm -rf out/*.class
	@ rm -rf src.txt

fclean: clean
	@ rm -rf out

.PHONY: compile run clean fclean
