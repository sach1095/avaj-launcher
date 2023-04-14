NAME = AvajLauncher
PATH = me.
EXEC = java
CC = javac
FLAG = -cp
SRCS = ./src -name "*.java"

$(NAME)	:
	find $(SRCS) > src.txt
	mkdir -p object
	$(CC) -d object @src.txt

run:
	java -classpath object/ $(NAME) scenario.txt

clean:
	rm -rf object

fclean: clean
		rm -rf $(PATH)/$(NAME)

.PHONY: run clean fclean
