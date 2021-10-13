package Kuba;

public class Hangman {

    public void showHangman(int count){

    switch(count){

        case 1 -> {System.out.println("_|_");
        System.out.println("6 tries left");}

        case 2 -> {
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_");
            System.out.println("5 tries left"); }

        case 3 -> {
            System.out.println("  _");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_");
            System.out.println("4 tries left"); }

        case 4 -> {
            System.out.println("  ___");
            System.out.println(" |   |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_");
            System.out.println("3 tries left"); }

        case 5 -> {
            System.out.println("  ___");
            System.out.println(" |   |");
            System.out.println(" |   0");
            System.out.println(" |   |");
            System.out.println("_|_");
            System.out.println("2 tries left"); }

        case 6 -> {
            System.out.println("  ___");
            System.out.println(" |   |");
            System.out.println(" |   0");
            System.out.println(" |  -|-");
            System.out.println("_|_");
            System.out.println("1 try left..."); }

        case 7 -> {
            System.out.println("  ___");
            System.out.println(" |   |");
            System.out.println(" |   0");
            System.out.println(" |  -|-");
            System.out.println("_|_  ^");
            System.out.println("You are dead!!!"); }
        }
    }
}

