public class TastAccount {
    public static void main(String[] args) {
        Account account=new Account(1000);
        account.addInterest();
        account.GetBalance();
        System.out.println("expected balance = "+1100);
    }
}
