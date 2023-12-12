import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Count {

    List<String> guesses;
    private final int attempts;
    private int remainingAttempts;
    private String word;

    public Count(String[] words){

        word = words[new Random().nextInt(words.length)].toUpperCase(); //Hämtar ett ord
        guesses = new ArrayList<String>();
        attempts = word.length();
        remainingAttempts = attempts;
    }

    public int getAttemptsRemaining() {
        return remainingAttempts;
    }

    public void guess(String str) {
        if (str.length() == word.length()) {
            guesses.add(str);
            remainingAttempts--;
        }
    }

    public boolean isItOver(){
        return remainingAttempts == 0;

    }

    public boolean gameOver () {
        return remainingAttempts == 0 || guesses.contains(word);
    }

    public String get_word(){
        return word;
    }

    public boolean win() {
        return guesses.contains(word);
    }


}
