import java.util.Scanner;

public class OddEvenArrayTester {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = inp.nextInt();
        int[] arr =new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            String oe = "";
            if (arr[i] % 2 == 0) oe = "even";
            else oe = "odd";

            System.out.println("Num " + arr[i] + " at " + i + " is " + oe);
        }
    }
}
