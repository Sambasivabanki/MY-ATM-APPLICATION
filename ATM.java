public class ATM {
    //variables that we required
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    //default constructor
    public ATM()
    {

    }
    //getter ans setter methods

    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double getDepositAmount()
    {
        return depositAmount;
    }
    public void setDepositAmoount(double depositAmount)
    {
        this.depositAmount=depositAmount;
    }
    public double getWithdrawAmount()
    {
        return withdrawAmount;
    }
    public void setWithdrawAmount(double withdrawAmount)
    {
        this.withdrawAmount=withdrawAmount;
    }    
}