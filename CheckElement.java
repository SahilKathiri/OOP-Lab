import java.util.Scanner;
import java.util.Arrays;

public class CheckElement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr;

        System.out.print("Enter the number of elements: ");
        int n = inp.nextInt();
        arr = new int[n];

        System.out.println("Enter the elements of the arrays: ");
        for(int i = 0; i < arr.length; i++)
            arr[i] = inp.nextInt();

        System.out.print("Enter the element to search: ");
        int key = inp.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println(key + " found at position " + (i+1) );
                return;
            }  
        }
        System.out.println("Element not found");
    }
}
