import java.util.*;
import java.io.Console;

class HM {
    char[] target;
    int guessLeft, errors;
    char[] guess;
    ArrayList<Character> done;
    String msg;

    public HM() {
        Console c = System.console();
        target = c.readPassword("A: Enter your word: ");
        guessLeft = target.length + 3;
        errors = 0;
        done = new ArrayList<>();

        //for(int i = 0; i < guess.length; i++) 
        //    guess[i] = ' ';
    }

    public void guess(char c) {
        done.add(c);
        for(int i = 0; i < target.length; i++) {
            String str = new String(target);
            
            if(done.contains(c)) {
                msg = "Already Guessed";
                break;
            }
            else if(c == target[i]) {
                guess[i] = c;
                msg = "";
            }
            else if (!str.contains(""+c)) {
                msg = "Wrong Guess";
                errors++;
                guessLeft--;
            }
            
        }
    }

    public boolean isDone() {
        String g = "";
        String tar = new String(target);

        for(int i = 0; i < guess.length; i++) {
            if(guess[i] == 12) 
                g += "-";
            else
                g += guess[i];
        }

        if(g.equals(tar)) return true;
        else return false;

    }

    public void display() {
        for(int i = 0; i < guess.length; i++) {
            if(guess[i] == 0) System.out.print("-");
            else System.out.print(guess[i]);

            System.out.print("\tRC:"+guessLeft+"\nE:"+errors+"\t"+msg); 
        }    
    }
}

public class HangmanTester {
    public static void main(String[] args) {
        HM w = new HM();
        Scanner inp = new Scanner(System.in);

        while(true) {
            System.out.print("B: Enter your guess: ");
            char guess = inp.next().charAt(0);
            w.guess(guess);
            w.display();
        }
    }    
}
