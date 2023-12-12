import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Count {

    List<String> guesses;
    private final int attempts;
    private int remainingAttempts;
    private final String word;

    public Count(String[] words){

        word = words[new Random().nextInt(words.length)].toUpperCase(); //Hämtar ett ord
        guesses = new ArrayList<String>();
        attempts = word.length();
        remainingAttempts = attempts;
    }

    public void printGuess(){
        for(int i =0; i < guesses.size(); i++){
            guesses.add("-");
        }
    }

    public void guess(String str) {
            guesses.add(str);
            remainingAttempts--;
    }

    public boolean isItOver(){
        return remainingAttempts == 0;

    }
    public boolean correctGuess(){
        return guesses.contains(word);
    }

    public String get_word(){
        return word;
    }
    public int get_attempts_left(){
        return attempts - remainingAttempts;
    }




}
