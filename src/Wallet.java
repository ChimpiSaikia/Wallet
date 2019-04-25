public class Wallet {

    private int Balance;

    public  Wallet(int Balance)
    {
        this.Balance = Balance;
    }

    public void checkBalance()
    {
//        if (Balance == 0)
//        {
//            System.out.println("Balance is Zero. Please add money");
//        }
        if (Balance <200)
        {
            System.out.println("Balance is less. Please add money");
        }
        System.out.println("The current balance is " +Balance);

    }

    public void addMoney(int amount)
    {
        Balance = Balance + amount;
        System.out.println("Amount of " +amount+ " is added");
    }

    public void removeMoney(int amount)
    {
        Balance = Balance - amount;
        System.out.println("Amount of " +amount+ " is removed");
    }
}
