import java.util.Scanner;

class Fraction {
    int a;
    int b;
    
    public Fraction() {}

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Fraction(String s) {


        this.a = Integer.parseInt(s.substring(0, s.indexOf("/")).trim());
        this.b = Integer.parseInt(s.substring(s.indexOf("/")+1, s.length()).trim());

        //System.out.println(this.a + "    " + this.b);
    }

    public int gcd(int a, int b) {
        while(b != 0) {
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }

    public void reduce() {
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;
    }

    public Fraction add(Fraction x, Fraction y) {
        Fraction res =  new Fraction();
        res.a = x.a*y.b + y.a*x.b;
        res.b = x.b * y.b;

        res.reduce();

        return res;
    }

    public void display() { System.out.println(this.a + "/" + this.b); }

}

public class FractionAddition {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Fraction a;
        Fraction b;

        System.out.print("Enter the first fraction: ");
        String aString = inp.next();
        a = new Fraction(aString);

        System.out.print("Enter the second fraction: ");
        String bString = inp.next();
        b = new Fraction(bString);

        Fraction c = a.add(a, b);

        System.out.println("The result is: ");
        c.display();
    }
}
