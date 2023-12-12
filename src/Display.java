import java.util.Scanner;

public class Display {


    Count count;
    Scanner input;
    final String BG_RESET = "\u001B[0m";
    final String BG_GREEN = "\u001B[32m";
    final String BG_YELLOW = "\u001B[33m";



    public Display(Count _count, Scanner _input){

        count = _count;
        input = _input;

    }

    //Printar alla gissninar gjord, och hur många gissninar det är kvar.
    public void print(){
        showAllGuesses();
        blankGuesses();
    }

    //regler och start prompt.
    public void prompt(){
        System.out.println();
        System.out.println(BG_GREEN + "- Wordle-Regler!" + BG_RESET);
        System.out.println("- Om bokstaven finns i ordet men på fel plats visas den med " +
                BG_YELLOW + "GUL " + BG_RESET + "Färg");
        System.out.println("- Om bokstaven finns i ordet och är på korrekt plats, visas den med " +
                BG_GREEN + "GRÖN " + BG_RESET + "Färg");
        System.out.println("- Om det inte är någon färg så finns inte bokstaven i ordet.");
        System.out.println();
    }

    //Alla gissningar gjorda.
    public void showAllGuesses(){

        //Delar upp svaren i mindre delar.
        //Först hämtas alla svar/inputs och läggs i en string med en for-loop.
        //Sedan en till for-loop för varje bokstav i det hämtade svaret.
        //Där matchas den igenom alla char mot alla char i det korrekta svaret.
        //Så om bokstaven matchar blir det grönt, inte matchar men finns i ordet så blir det gult osv.
        //Allt sätts sedan ihop med en stringbuilder.
        StringBuilder b = new StringBuilder();
        for (String svar : count.guesses) {

            for (int i = 0; i < svar.length(); i++) {
                String answer = count.get_word();
                char c = svar.charAt(i);


                if (answer.charAt(i) == c) {
                    b.append(BG_GREEN + c + BG_RESET);

                } else if (answer.contains(Character.toString(c))) {
                    b.append(BG_YELLOW + c + BG_RESET);
                } else {
                    b.append(c);
                }
                b.append("|");
            }


            System.out.println(b.toString());

            b = new StringBuilder();
        }
    }


    //Kollar om input har rätt mängd bokstäver.
    //Annars lägger in svaret i arr med alla svar i Class Count.
    public String showGuess(){

        while (true){
            System.out.print("Skriv in ett ord: ");
            String guess = input.nextLine().toUpperCase();

            if (guess.length() != count.get_word().length()) {
                System.out.println("Skriv in ett ord med " + count.get_word().length() + " bokstäver.");
            } else {
                count.guess(guess);
                return guess;
            }
        }
    }

    //Publicerar tomma rutor för att se antal försök kvar.
    //Samma funktionallitet som funktionen showAllGuesses
    public void blankGuesses() {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < count.getAttemptsRemaining(); i++) {
            for (int j = 0; j < count.get_word().length(); j++) {
                b.append("_|");
            }
            System.out.println(b.toString());
            b = new StringBuilder();
        }
    }

}
