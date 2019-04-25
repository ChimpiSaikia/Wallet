public class Main {

    public static void main(String args[]){

        Wallet wallet;

        Owner owner1 = new Owner(wallet = new Wallet(1000));
        System.out.println("Details for Owner1 *****");
        owner1.initialBalance();
        owner1.addMoney(500);
        owner1.removeMoney(300);
        owner1.checkBalance();

        Owner owner2 = new Owner(wallet = new Wallet(500));
        System.out.println("Details for Owner2 *****");
        owner2.initialBalance();
        owner2.addMoney(300);
        owner2.removeMoney(200);
        owner2.checkBalance();
    }

}
