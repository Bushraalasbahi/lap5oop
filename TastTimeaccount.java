public class TastTimeaccount {
    public static void main(String[] args) {
        Timeaccount b=new  Timeaccount(5000);
        System.out.println(b.display_balance());
        b.Add_interest();
        b. withdraw_balance(2200);
        System.out.println(b.display_balance());
    }
}
