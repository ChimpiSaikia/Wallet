public class AmazonPay implements Cashback {

    public int cashBackRule(int currentBalance) {
        int CashBackAmount;
        if (currentBalance > 1000) {
            CashBackAmount = (20*1000)/100;
            System.out.println("Cash Back from AmazonPay is "+CashBackAmount);
            return CashBackAmount;
        }
        else
            return 0;

    }
}
