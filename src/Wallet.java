public class Wallet{

    private int Balance;

    public  Wallet(int Balance)
    {
        this.Balance = Balance;
    }


    public int addMoney(int amount)
    {
        Balance = Balance + amount;
        return Balance;
    }

    public int removeMoney(int amount)
    {
        Balance = Balance - amount;
        return Balance;
    }
    public int checkBalance()
    {
        System.out.println("The current balance is " +Balance);
        return Balance;
    }


    public int initialBalance()
    {
        return Balance;
    }


}
