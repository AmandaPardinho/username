# Creating an Username

Many applications need a username to login. Imagine an application with these rules to create a username:

1. The username is between 4 and 25 characters.
2. It must start with a letter.
3. It can only contain lower case letters, numbers, and the underscore character.
4. It cannot finish with an underscore character.

If user obeys the rules, the program should return a message "This username complies with the rules", otherwise return a message "This username is not allowed".