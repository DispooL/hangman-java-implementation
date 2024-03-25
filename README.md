# Hangman Game in Java

This repository contains a Java implementation of the classic game Hangman. The game is a simple word guessing game where a player tries to figure out a hidden word by guessing letters. If the player guesses a letter that is in the word, the letter appears in its correct positions in the word. If the letter is not in the word, a part of a 'hangman' is drawn. The player must guess the word before the hangman is fully drawn.

## Implementation Details
* Core Data Structures: The main data structure used for tracking the progress of the guessed word is a Character array. This choice facilitates easy updates to the word as the player makes correct guesses, filling in the corresponding blanks ('_') with the correctly guessed letters.

* Game Logic: The core game mechanics are encapsulated within the Hangman class, which implements the HangmanInterface. This interface defines essential methods such as guess(char letter), isSolved(), and tracking the number of mistakes made by the player.

* User Interactions: The game interacts with the user through the console, using System.out.println for output and Scanner for input. Players can start a new game or exit at any time.

* Word Selection: Words are randomly selected from a predefined list within the WordSupplier class. This list can be easily expanded to increase the variety of the game.

* Error Handling: User inputs are validated to ensure that only single characters are guessed at each turn. The program uses Enums (UserActionEnum) to handle different user actions, improving the readability and maintainability of the code.

## How to Run
To play the game, compile and run the HangmanGameHandler class. The game will start in the console, and you can follow the on-screen instructions to play.

1. Select action type (1 to start, 2 to exit).
2. If the game starts, guess one letter at a time to try and figure out the hidden word.
3. The game will indicate whether each guess is correct or incorrect and show your progress on the word.
4. Continue guessing letters until you either solve the word or reach the maximum number of allowed mistakes.
## Notes
* The implementation uses an array to track the word's progress because it allows for an intuitive mapping between the array indices and the character positions in the word.
* Although other data structures were considered, the simplicity and directness of a Character array were deemed most suitable for this game's requirements.
* The game is structured in a modular way, separating concerns and allowing for easy modifications and extensions, such as adding new words or changing the game's difficulty level.
Enjoy playing the Hangman game and feel free to contribute to the code or suggest any improvements!