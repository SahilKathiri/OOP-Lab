import java.util.Scanner;

class Sum extends Thread {
    int starti, endi;
    int sum = 0;
    Thread thr;

    public Sum(int x, int y) {
        starti = x;
        endi = y;
        thr = new Thread(this);
    }

    public void run() {
        for(int i = starti; i <= endi; i++) {
            sum += i;
//            try {
//                Thread.sleep(100);
//            } catch(InterruptedException e) {}
//            System.out.println(getName() + "....i = " + i);
        }    
    }

    public int getSum() {return sum;}

    public void display() {
        System.out.println("Sum: " + sum);    
    }
}

public class SumThread {
    public static void main(String[]  args) {
        int num, th;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter no to which to find sum: ");
        num = inp.nextInt();

        System.out.print("Enter no of threads: ");
        th = inp.nextInt();

        System.out.println("Creating threads...");
        int start = 1, end = num/th;
        Sum[] sumth= new Sum[th];
        for(int i = 0; i < th && end <= num; i++) {
            sumth[i] = new Sum(start, end);
            start = end + 1;
            end = end + num/th;
        }

        System.out.println("Starting threads...");
        for(int i = 0; i < th; i++) {
            sumth[i].start();
        }

        System.out.println("Waiting for threads to finish...");
        for(int i = 0; i < th; i++) {
            try{
                sumth[i].join();
            } catch(InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }

        int sum = 0;
        for(int i = 0; i < th; i++) {
            sum += sumth[i].sum;    
        }

        System.out.println("\n\nThe sum is: " + sum);
    }    
}
