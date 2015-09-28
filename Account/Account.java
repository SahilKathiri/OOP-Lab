public class Account {
    private double amount;
    private String name;
    private int id;

    // Constructors
    public Account() {}

    public Account(String name, double amount, int id) {
        this.name = name;
        this.amount = amount;
        this.id = id;
    }

    // Calculations
    public void deposit(double amt) {
        amount += amt;
    }

    public void withdraw(double amt) {
        amount -= amt;
    }
    
    // Display 
    public void display() {
        System.out.println("ID: " + id + "\nName: " + name + "\nAmount: " + amount);
    }
}
