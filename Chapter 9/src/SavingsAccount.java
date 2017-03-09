public class SavingsAccount extends BankAccount
{
    public int minAmount;
    private double minAmout;
    private int numberOfWithdrawals;
    
    public boolean withdraw(double amount)
    {
     if (getBalance() >= amount + minAmount)
     {
         super.withdraw(amount);
         return true;
        }
        else return false;
    }
    
    public SavingsAccount()
    {
        balance = 0;
        numberOfwithdrawals = 0;
    }
    
    public void withdraw (int amount)
    {
        double tempBalance;
                tempBalance = balance - withdrawMoney;
            
                //checks to make sure you have enough money before calculations are done
                if (tempBalance < 25) {
                    System.out.println ("Insufficient funds! You only have $" + balance + " dollars" );
            }
            
                else {
                    balance -= withdrawMoney;
      
    }
}
    
    public void resetNumOfWithdrawals ()
    {
        
    }
}
