package Kuba;

import java.util.*;

public class GuessBase {

    private static ArrayList<Guess> guesses = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addTemplateGuesses(){

        guesses.add(new Guess("encapsulation", "HARD",  "IT"));
        guesses.add(new Guess("overloading", "HARD", "IT"));
        guesses.add(new Guess("overriding", "HARD", "IT"));
        guesses.add(new Guess("bicycle", "MEDIUM", "vehicle"));
        guesses.add(new Guess("aeroplane", "MEDIUM", "vehicle"));
        guesses.add(new Guess("monkey", "MEDIUM", "animal"));
        guesses.add(new Guess("cow", "EASY",  "animal"));
        guesses.add(new Guess("dog", "EASY",  "animal"));
        guesses.add(new Guess("cat", "EASY",  "animal"));
        guesses.add(new Guess("two", "EASY",  "number"));
        guesses.add(new Guess("four", "EASY",  "number"));
    }

    public void addGuess(){

        System.out.println("Name: ");
        String name=scanner.nextLine();

        System.out.println("Difficulty level: ");
        String difficultyLevel= scanner.nextLine();

        System.out.println("Category: ");
        String category=scanner.nextLine();

        Guess guess = new Guess(name,difficultyLevel,category);

        guesses.add(guess);

    }
    public void displayNames(){
        HashSet<String> strings = new HashSet<>();
        System.out.println("Names: ");
        for (Guess n:guesses
             ) {
            strings.add(n.getName());
        }
        System.out.println(strings);
    }

    public void displayCategories(){

        HashSet<String> setGuesses = new HashSet<>();
        System.out.println("Categories: ");
        for (Guess c: guesses
        ) {
            setGuesses.add(c.getCategory());
        }
        System.out.println(setGuesses);
    }

    public void displayCaterory(String string){
        for (Guess g:guesses
             ) {if (g.getName().equals(string)){
            System.out.println("Category: " + g.getCategory());
        }
        }
    }

    public String randomGuess(String difficultyLevel) {

        Random random = new Random();

        String randomGuess = difficultyLevel.toUpperCase();

        switch (randomGuess) {

            case "EASY"  -> {
                ArrayList<Guess> easyGuesses = new ArrayList<>();
                for (Guess g : guesses
                ) {
                    if (g.getDifficultyLevel().equals("EASY") || g.getDifficultyLevel().equals("easy") ) {
                        easyGuesses.add(g);
                    }
                }
                int index = random.nextInt(easyGuesses.size());
                 randomGuess = easyGuesses.get(index).getName();
            }

            case "MEDIUM" -> {
                ArrayList<Guess> mediumGuesses = new ArrayList<>();
                for (Guess g : guesses
                ) {
                    if (g.getDifficultyLevel().equals("MEDIUM") || g.getDifficultyLevel().equals("medium"))  {
                        mediumGuesses.add(g);
                    }
                }
                int index = random.nextInt(mediumGuesses.size());
                randomGuess = mediumGuesses.get(index).getName();
            }

            case "HARD" -> {
                ArrayList<Guess> hardGuesses = new ArrayList<>();
                for (Guess g : guesses
                ) {
                    if (g.getDifficultyLevel().equals("HARD") ||g.getDifficultyLevel().equals("hard")) {
                        hardGuesses.add(g);
                    }
                }
                int index = random.nextInt(hardGuesses.size());
                randomGuess = hardGuesses.get(index).getName();
            }
        }
        return randomGuess;
    }
}
