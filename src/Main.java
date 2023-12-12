import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        //Orden i spelet
        String[] words = {"SHAKE","SHARE","PANIC","AMUSE","SHADE"};



        Scanner input = new Scanner(System.in);

        //String guess = input.nextLine().toUpperCase();


        //Skapar ny instans av Count som är klassen som en scoreboard m regler
        Count count = new Count(words);

        //Instansen av count skickas med till konstruktorn i Display + input.
        Display display = new Display(count,input);

        //Kollar om spelet är över.
        while (!count.gameOver()) {
            display.print();
            display.showGuess();
        }

        display.print();

        if (count.win()) {
            System.out.println("Grattis du gissade korrekt ord");
        } else {
            System.out.println("Du gissade inte korrekt ord");
        }
        System.out.println("The answer was " + count.get_word());


        }

        public boolean game(){
         return true;
        }
    }

