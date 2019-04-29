public class Main {

    public static void main(String args[]){

        Wallet wallet;
        Owner owner1 = new Owner( new Wallet(1000));
        AmazonPay amazonPay = new AmazonPay();
        GooglePay googlePay = new GooglePay();
        System.out.println("Details for Owner1 *********");
        owner1.initialBalance();
        owner1.addMoney(500);
        owner1.removeMoney(300);
        int balanceAmount1 = owner1.checkBalance();
        amazonPay.cashBackRule(balanceAmount1);
        googlePay.cashBackRule(balanceAmount1);
        System.out.println(" ");

        Owner owner2 = new Owner(wallet = new Wallet(500));
        System.out.println("Details for Owner2 *********");
        owner2.initialBalance();
        owner2.addMoney(300);
        owner2.removeMoney(200);
        int balanceAmount2 = owner2.checkBalance();
        amazonPay.cashBackRule(balanceAmount2);
        googlePay.cashBackRule(balanceAmount2);
    }

}
