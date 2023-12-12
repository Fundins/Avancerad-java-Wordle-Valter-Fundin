import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


           while(true){
                //Orden i spelet
                String[] words = {"SHAKE","SHARE","PANIC","AMUSE","SHADE"};


                Scanner input = new Scanner(System.in);

                //Skapar ny instans av Count som är klassen som en scoreboard m regler
                Count count = new Count(words);

                //Instansen av count skickas med till konstruktorn i Display + input.
                Display display = new Display(count,input);
                display.prompt();

                //Loop som kollar om spelet är över.
               //Annars fortsätter den att printa spelet.
                while (!count.gameOver()) {
                    display.print();
                    display.showGuess();

                }
                display.print();

                //Kollar hur spelet avslutades. Antingen rätt gissat eller slut på försök.
                if (count.win()) {
                    System.out.println("Grattis du gissade korrekt ord");
                } else {
                    System.out.println("Du gissade inte korrekt ord");
                }
                System.out.println("Svaret var " + count.get_word());

                //Kollar om användaren vill spela om spelet.
                System.out.println("Tryck 'y' för att spela igen");
                System.out.println("Tryck 'n' för att avsluta");
                String ans = input.nextLine().toLowerCase();
                if (!ans.equals("y")){break;}
            }

    }
}

