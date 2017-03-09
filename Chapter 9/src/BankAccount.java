public class BankAccount
{
    // class fields    
    private double balance;
    private double deposit;
    private double withdrawal;
    private double annualRate;
    private double monthlyFee;
    private double monthlyInterest;
    
    //constructor
    public BankAccount(double myBalance, double myAnnualRate)
    {
        //initiliaze class fields
        balance = myBalance;
        annualRate = myAnnualRate;
        deposit = 0;
        withdrawal = 0;
        monthlyFee = 0;
    }
    
    //class methods
    public double getBalance()
    {
        return balance;
    }
    
    public void setBalance(double myBalance)
    {
        balance = myBalance;
    }
    
    public double getDeposit()
    {
        return deposit;
    }
    
    public void setDeposits(double myDeposit)
    {
        balance = myDeposit;
        deposit += 1;
    }
    
    public double getWithdrawal()
    {
        return withdrawal;
    }
    
    public void setWithdrawal(double myAmount)
    {
        double amount = myAmount;
        balance = balance - myAmount;
        withdrawal += 1;
    }
    
    public double getAnnualRate()
    {
        return annualRate;
    }
    
    public double calcInterest()
    {
        double monthlyRate;
        monthlyRate = (annualRate/12);
        monthlyInterest = balance * monthlyInterest;
        balance = balance + monthlyRate;
        return balance;
    }
    
    public String getMonthlyProcess()
    {
        calcInterest();
        withdrawal = 0;
        deposit = 0;
        monthlyFee = 0;
        return "Monthly Process: " + balance;
    }
}