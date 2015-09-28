import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the sum: ");
        int sum = inp.nextInt();

        if(sum%2 != 0) {
            System.out.println("The number is not divisible by 2\nHence not valid\n\nExitting....");
            return;
        }
        
        double start = (sum/4.0)-7.5;

        double[][] sq = new double[4][4];

        sq[3][3] = start;

        System.out.println("The square will have numbers from " + start + " to " + (start+15));

        sq[0][0] = start + 15.;
        sq[0][1] = start + 1.;
        sq[0][2] = start + 2.;
        sq[0][3] = start + 12.;

        sq[1][0] = start + 4.;
        sq[1][1] = start + 10.;
        sq[1][2] = start + 9.;
        sq[1][3] = start + 7.;

        sq[2][0] = start + 8.;
        sq[2][1] = start + 6.;
        sq[2][2] = start + 5.;
        sq[2][3] = start + 11.;

        sq[3][0] = start + 3.;
        sq[3][1] = start + 13.;
        sq[3][2] = start + 14.;


        for(double[] row : sq) {
            for(double elem : row) {
                System.out.print(String.format("%7.2f", elem) + "  ");
            }
            System.out.println();
        }

    }
}
