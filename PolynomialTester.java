import java.util.Scanner;
import java.util.ArrayList;

class Term {
    int val, pow;

    public int getval() {return val;}
    public int getpow() {return pow;}

    public Term(int x, int y) {val = x; pow = y;}
    public Term() {}
}

class Polynomial {
    ArrayList<Term> fn = new ArrayList<>();
    Scanner inp = new Scanner(System.in);

    public Polynomial() {}

    public void populate() {
        System.out.print("Enter the number of terms: ");    
        int n = inp.nextInt();
        
        for(int i = 0; i < n; i++ ) {
            int val = inp.nextInt();
            int pow = inp.nextInt();
            Term temp = new Term(val, pow);
            fn.add(temp);
        }
    }

    public void display() {
        for(int i = 0; i < fn.size(); i++) {
            String sign = (fn.get(i).getval() < 0)? "-" : "+" ;
            System.out.println(sign + " " + fn.get(i).getval() + " x^" + fn.get(i).getpow() + " " );
        }
    }

    public int calc(int x) {
        int sum = 0;
        for(int i = 0; i < fn.size(); i++) {
            sum += fn.get(i).getval() * Math.pow(x, fn.get(i).getpow());    
        }
        return sum;
    }
}

public class PolynomialTester {
    public static void main(String[] args) {
        Polynomial f = new Polynomial();
        Scanner inp = new Scanner(System.in);

        f.populate();
        System.out.println("The given polynomial is: ");
        f.display();
        System.out.print("Enter the value of x: ");
        int x = inp.nextInt();
        System.out.println("The value at x=" + x + " is " + f.calc(x));
    }    
}
