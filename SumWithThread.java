import java.util.Scanner;

class Sum implements Runnable {
    int starti, endi;
    int sum = 0;

    public Sum(int x, int y) {
        starti = x;
        endi = y-1;
    }

    public void run() {
        for(int i = starti; i <= endi; i++) {
            sum += i;    
        }    
    }

    public int getSum() {return sum;}

    public void display() {
        System.out.println("Sum: " + sum);    
    }
}

public class SumWithThread {
    public static void main(String[]  args) {
        int num, th;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter no to which to find sum: ");
        num = inp.nextInt();

        System.out.print("Enter no of threads: ");
        th = inp.nextInt();

        System.out.println("Creating threads...");
        int start = 0, end = num/th;
        Thread[] sumth= new Thread[th];
        for(int i = 0; i < th && end <= num; i++) {
            sumth[i] = new Thread(new Sum(start, end));
            start = end;
            end = end + num/th;
        }

        System.out.println("Starting threads...");
        for(int i = 0; i < th; i++) {
            sumth[i].start();    
        }

        System.out.println("Waiting for threads to finish...");
        for(int i = 0; i < th; i++) {
            sumth[i].join();    
        }

        int sum = 0;
        for(int i = 0; i < th; i++) {
            sum += ((Sum)sumth[i]).sum;    
        }

        System.out.println("\n\nThe sum is: " + sum);
    }    
}
