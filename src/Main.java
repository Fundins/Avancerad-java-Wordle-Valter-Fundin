import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        //Orden i spelet
        String[] words = {"SHAKE","SHARE","PANIC","AMUSE","SHADE"};



        Scanner input = new Scanner(System.in);
        System.out.println("Start");
        //String guess = input.nextLine().toUpperCase();


        //Skapar ny instans av Count som är klassen som en scoreboard m regler
        Count count = new Count(words);

        Display display = new Display(count,input);
        //System.out.println(guess);

        while (!count.isItOver() || !count.correctGuess()) {
            display.print();
            display.showGuess();


        }
        display.print();




        }
    }

