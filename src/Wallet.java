public class Wallet {

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
    public void checkBalance()
    {
        if (Balance <200)
        {
            System.out.println("Balance is less. Please add money");
        }
        System.out.println("The current balance is " +Balance);

    }
    public int initialBalance()
    {
        return Balance;
    }
}
