import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {






        //Orden i spelet
        String[] words = {"SHAKE","SHARE","PANIC","AMUSE","SHADE"};



        Scanner input = new Scanner(System.in);
        String guess = input.nextLine().toUpperCase();

        //Skapar ny instans av Count som är klassen som en scoreboard m regler
        Count count = new Count(words);

        Display display = new Display(count,input,guess);
        System.out.println("Hello Worlds");

        while (!count.isItOver() || !count.correctGuess()) {
            display.print();
            display.showGuess();


        }
        display.print();

       /* for(int round=0;round<6;round++) {



            for (int i = 0; i < 5; i++) {
                if (guess.substring(i, i + 1).equals(correct.substring(i, i + 1))) {
                    //Bokstav matchar och är i ord
                    System.out.print(BG_GREEN + guess.charAt(i) + BG_RESET);
                } else if (correct.contains(guess.substring(i, i + 1))) {
                    //Bokstav är i ord men inte rätt position
                    System.out.print(BG_YELLOW + guess.charAt(i) + BG_RESET);
                } else {
                    //Bokstav är inte i ord
                    System.out.print(guess.charAt(i));
                }
            }
            //Om det är rätt
            if(guess.equals(correct)){
                System.out.println();
                System.out.println("Correct Guess");
                break;
            }
            System.out.println();

        }
        if(!guess.equals(correct)){
            System.out.println("Game Failed. Prova igen type y");
        } */







/*
        //Sätter alla ord i en array(String)
        String[] words = {"HELLO", "WORLD", "LEARN", "CRATE"};
        int index = (int) (Math.random() * words.length);
        //Genererar ett random ord, = index i Listan.
        String svar = words[index].toUpperCase();
        //String answer = words[new Random().nextInt(words.length)].toUpperCase();

        //Skickar med array med ord till konsturktorn Board
        //Board board = new Board(words);
        Board board = new Board(svar);

        //Scanner
        Scanner input = new Scanner(System.in);

        Presentation p = new Presentation(board, input);

        //While loop som kollar om spelet är över.
        while (!board.isGameOver()) {
            p.print();
            //p.promptGuess();
        }
        p.print();

        //När spelet är över, antingen om slut på gissningar eller korrekt svar.
        //Så printas diverse svar.
        if (board.didWin()) {
            System.out.println("Congratulations, you guessed correctly");
        } else {
            System.out.println("Sorry, you did not guess correctly");
        }
        System.out.println("The answer was " + svar);
        //input.close();
        }

        */
        }
    }

