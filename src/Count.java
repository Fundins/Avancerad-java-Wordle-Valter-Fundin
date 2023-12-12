import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Count {

    List<String> guesses;
    private  int attempts;
    private int remainingAttempts;
    private String word;

    public Count(String[] words){
        word = words[new Random().nextInt(words.length)].toUpperCase(); //Hämtar ett ord
        guesses = new ArrayList<String>();
        attempts = word.length();
        remainingAttempts = attempts;
    }

    public void populateGuess(){
        for(int i =0; i < 5; i++){
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

    public String get_Word(){
        return word;
    }
    public int get_attempts(){
        return attempts - remainingAttempts;
    }




}
