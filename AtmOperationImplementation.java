import java.util.HashMap;
import java.util.Map;

public class AtmOperationImplementation implements AtmOperationInterface
{
    ATM atm=new ATM();
    HashMap<Double,String> ministmt=new HashMap<>();
    @Override
    public void viewBalance()
    {
        System.out.println("Available Balance is:"+atm.getBalance());
    }
    @Override
    public void withdrawAmount(double withdrawAmount)
    {
        if(withdrawAmount<=atm.getBalance())
        {
        ministmt.put(withdrawAmount," Amount Withdrawn");
        System.out.println(withdrawAmount+" Amount withdraw Success!!");
        atm.setBalance(atm.getBalance()-withdrawAmount);
        viewBalance();
        }
        else
        {
            System.out.println("Insufficient Balance!!");
        }
    }
    @Override
    public void depositAmount(double depositAmount)
    {
        ministmt.put(depositAmount," Amount deposited");
        System.out.println(depositAmount+" Deposited Sucessfully!!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }
    @Override
    public void viewMiniStatement()
    {
        for(Map.Entry<Double,String> m:ministmt.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
    
    
}
