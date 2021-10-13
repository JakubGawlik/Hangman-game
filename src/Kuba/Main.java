package Kuba;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

//ArrayList guesses jest statyczne i jest współdzielona przez wszystkie instancje klasy GuessBase

    public static void main(String[] args) {

        GuessBase base1 = new GuessBase();

        base1.addTemplateGuesses();

        boolean showOptions = true;

        while (showOptions){
            System.out.println("Choose an option:");
            System.out.println("1. Start new game");
            System.out.println("2. Add new guess");
            System.out.println("3. Display all guesses");
            System.out.println("4. Display all categories");
            System.out.println("5. Exit");

            Scanner scann = new Scanner(System.in);

            int option = scann.nextInt();

            switch (option){
                case 1: runGame();
                showOptions=true;
                    break;
                case 2: base1.addGuess();
                break;
                case 3: base1.displayNames();
                break;
                case 4: base1.displayCategories();
                break;
                case 5:
                    System.out.println("Program has stopped");
                    System.exit(5);
                    break;
            }
        }
    }
    public static void runGame(){

        GuessBase base1 = new GuessBase();

        Hangman hangman = new Hangman();

        int count = 0;

        System.out.println("Select difficulty level: (EASY / MEDIUM / HARD)");

        Scanner scanner = new Scanner(System.in);

        String string = base1.randomGuess(scanner.nextLine());

        base1.displayCaterory(string);

        char[] guessArray = string.toCharArray();

        char[] guessedArray= new char[guessArray.length];

        char[] notGuessedArray = new char[7];

        for (int i = 0; i < guessArray.length ; i++) {
            guessedArray[i]='_';
        }
        System.out.println(guessedArray);

        while (!Arrays.equals(guessArray, guessedArray) && count<=6) {

            Scanner scanner2 = new Scanner(System.in);

            System.out.println("Enter a letter: ");

            char guessChar = scanner2.next().charAt(0);

            if (string.contains(String.valueOf(guessChar))) {
                for (int i = 0; i < guessArray.length; i++) {
                    if (guessChar == guessArray[i]) {
                        guessedArray[i] = guessChar;
                        System.out.println("Good answer!");
                    }
                }
            } else {
                System.out.println("Bad answer...");
                count++;
                notGuessedArray[count-1]=guessChar;}

            System.out.println(guessedArray);
            hangman.showHangman(count);
            System.out.println("Used letters: " + Arrays.toString(notGuessedArray));
        }
        if (Arrays.equals(guessArray, guessedArray)){
            System.out.println("Brawo!");
        }else System.out.println("It was " + string + "...");
    }

}
