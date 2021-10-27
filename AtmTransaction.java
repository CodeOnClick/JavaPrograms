import java.util.Scanner;
public class AtmTransaction
{
    public static void main(String args[] )
    { 
        double balance = 0, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1 for Withdraw");
            System.out.println("Enter 2 for Deposit");
            System.out.println("Enter 3 for Check Balance");
            System.out.println("Enter 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextDouble();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money you want to deposit:");
                deposit = s.nextDouble();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}
