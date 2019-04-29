public class Owner {

    int money;
    Wallet wallet;

    public Owner(Wallet wallet) {
        this.wallet= wallet;
   }

    public void addMoney(int amount) {
        money = wallet.addMoney(amount);
        System.out.println("Balance after amount " + amount+ " is added: " +money);

    }
    public void removeMoney(int amount) {
        money = wallet.removeMoney(amount);
        System.out.println("Balance after amount " + amount + " is removed: " + money);
    }

    public int checkBalance(){
        return wallet.checkBalance();

    }
    public void initialBalance(){
        money = wallet.initialBalance();
        System.out.println("Initial Balance: " + money);
    }
}
