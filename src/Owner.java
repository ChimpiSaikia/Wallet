public class Owner {

    private int money=1000;
    Wallet wallet;

    public Owner(){
         wallet = new Wallet(money);
    }


    public void addMoney() {
        wallet.addMoney(500);

    }
    public void removeMoney(){
        wallet.removeMoney(300);

    }
    public void checkBalance(){
        wallet.checkBalance();

    }
}
