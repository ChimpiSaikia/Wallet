public class GooglePay implements Cashback{

    public int cashBackRule(int currentBalance) {
        int CashBackAmount;
        if (currentBalance > 500) {
            CashBackAmount = (20*500)/100;
            System.out.println("Cash Back from Google Pay is "+CashBackAmount);
            return CashBackAmount;
        }
        else
            return 0;

    }
}
