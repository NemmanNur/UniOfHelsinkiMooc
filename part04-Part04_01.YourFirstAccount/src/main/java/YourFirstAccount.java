
public class YourFirstAccount {

    public static void main(String[] args) {
        Account nemmanAccount = new Account("g",100.0);
        nemmanAccount.deposit(20.0);
        System.out.print(nemmanAccount);
    }
}
