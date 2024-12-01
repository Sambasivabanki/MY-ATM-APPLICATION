import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        AtmOperationInterface op=new AtmOperationImplementation();
       int atmnumber=12345;
       int atmpin=123;
       Scanner sc=new Scanner(System.in);
       System.out.println("Welcome to ATM Machine !!!");
       System.out.print("Enter Atm Number: ");
       int Number=sc.nextInt(); 
       System.out.print("Enter Your Pin: ");
       int Pin=sc.nextInt();
       if((atmnumber==Number)&&(atmpin==Pin))
       {
            while(true)
            {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.print("Enter your Choice:");
                int ch=sc.nextInt();
                if(ch==1)
                {
                    op.viewBalance();
                }
                else if(ch==2)
                {
                    System.out.print("Enter Amount to be Withdrawn:");
                    double withdrawAmount=sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(ch==3)
                {
                    System.out.print("Enter Amount to Deposit:");
                    double depositAmount=sc.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(ch==4)
                {
                    op.viewMiniStatement();
                }
                else if(ch==5)
                {
                    System.out.println("Collect Your Atm card\nThank you Visit Again");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please Enter Correct Choice");
                }
            }    
       }
       else
       {
            System.out.println("Incorrect AtmNumber or Pin");
            System.exit(0);
       }
    }
}