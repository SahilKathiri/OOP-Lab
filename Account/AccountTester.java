public class AccountTester {
    public static void main(String[] args) {
        Account s1 = new Account("abc", 1000, 101);
        s1.deposit(500);
        s1.display();
        s1.withdraw(200);
        s1.display();
    }
}
