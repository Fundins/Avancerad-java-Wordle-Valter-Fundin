import java.util.Scanner;
/*
  Rules
  A random 5-letter word is selected from a word bank
  The user will have 6 attempts to guess the word correctly
  If the word guessed has a letter in the correct place, the letter will be presented as green
  If the word guessed has a letter that is contained in the answer but the wrong place, the letter will be presented as yellow
  If the letter is not contained in the answer, it will be presented as white
*/
public class Main {
    public static void main(String[] args) {

        //Färger
         final String BG_RESET = "\u001B[0m"; //Normal färg.
         final String BG_GREEN = "\u001B[32m";
         final String BG_YELLOW = "\u001B[33m";

        System.out.println("Wordle");
        System.out.println("Du har 6 Försök på dig");



        String[] words = {"SHAKE","SHARE","PANIC","AMUSE","SHADE"};
        int index = (int) (Math.random() * words.length);
        String correct = words[index];
        String guess ="";
        //Gissningar
        for(int round=0;round<6;round++) {
            System.out.println("Försök: " + (round+1));
            System.out.print("Gissa ordet. > ");
            Scanner sc = new Scanner(System.in);

             guess = sc.nextLine().toUpperCase();


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
        }

        }
    }

