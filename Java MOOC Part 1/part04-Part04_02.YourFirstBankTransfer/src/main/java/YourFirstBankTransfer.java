
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account MatthewsAccount = new Account("Matthews account",1000.0);
        Account MyAccount = new Account("My account", 0.0);
        MatthewsAccount.withdrawal(100.0);
        MyAccount.deposit(100.0);
        System.out.println(MatthewsAccount);
        System.out.println(MyAccount);
    }
}
