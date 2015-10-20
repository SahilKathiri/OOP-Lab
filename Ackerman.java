import java.util.Scanner;

public class Ackerman {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = inp.nextInt();
        System.out.print("Enter n: ");
        int n = inp.nextInt();

        System.out.println("Ackerman fn of " + m + " and " + n + " is " + acker(m,n));

    }   

    public static int acker(int m, int n) {
        if (m == 0 && n >= 0 ) 
            return n+1;
        else if ( n == 0 && m > 0) 
            return acker(m-1, 1);
        else if  (m > 0 && n > 0) 
            return acker(m-1, acker(m, n-1));
        else return 0;
    }

}
