import java.util.Scanner;

public class Display {


    Count count;
    Scanner input;
    final String BG_RESET = "\u001B[0m";
    final String BG_GREEN = "\u001B[32m";
    final String BG_YELLOW = "\u001B[33m";

    String guess;

    public Display(Count _count, Scanner _input, String _guess){

        count = _count;
        input = _input;
        guess = _guess;
    }

    public void print(){
        showAllGuesses();

        //showGuesses();
        //print blanks
        clear();
    }

    public void showAllGuesses(){
        for (String s : count.guesses){

            for (int i = 0; i < s.length(); i++) {
                if (guess.substring(i, i + 1).equals(count.get_Word().substring(i, i + 1))) {
                    //Bokstav matchar och är i ord
                    System.out.print(BG_GREEN + guess.charAt(i) + BG_RESET);
                } else if (count.get_Word().contains(guess.substring(i, i + 1))) {
                    //Bokstav är i ord men inte rätt position
                    System.out.print(BG_YELLOW + guess.charAt(i) + BG_RESET);
                } else {
                    //Bokstav är inte i ord
                    System.out.print(guess.charAt(i));
                }
            }

        }
    }
    public void showGuesses(){

        for(int round=0;round<count.guesses.size();round++) {


            for (int i = 0; i < count.get_Word().length(); i++) {
                if (guess.substring(i, i + 1).equals(count.get_Word().substring(i, i + 1))) {
                    //Bokstav matchar och är i ord
                    System.out.print(BG_GREEN + guess.charAt(i) + BG_RESET);
                } else if (count.get_Word().contains(guess.substring(i, i + 1))) {
                    //Bokstav är i ord men inte rätt position
                    System.out.print(BG_YELLOW + guess.charAt(i) + BG_RESET);
                } else {
                    //Bokstav är inte i ord
                    System.out.print(guess.charAt(i));
                }
            }
            //Om det är rätt

            System.out.println(count.guesses);

        }
    }

    //Kollar om input har rätt mängd bokstäver.
    //Annars lägger in svaret i arr med alla svar i Class Count.
    public String showGuess(){
        while (true){
            System.out.println("Skriv in ett ord");


            if (guess.length() != count.get_Word().length()) {
                System.out.println("Skriv in ett ord med " + count.get_Word().length() + " bokstäver.");
            } else {
                count.guess(guess);
                return guess;
            }
        }
    }
    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
