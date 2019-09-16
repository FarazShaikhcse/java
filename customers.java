import java.util.Scanner;
public class customers {
String name;
int cid;
customers()
{}
customers(String a,int b)
{
	name=a;
	b=cid;
}
}
class account extends customers{
	String type;
	double balance=0;
	Scanner r=new Scanner(System.in);
    account(String a,int b,String c,double d)
    {
    	super(a,b);
    	type=c;
    	balance=d;
    }
    void deposit()
    {
    	double b;
    	System.out.println("Enter the amount to be deposited");
    	b=r.nextDouble();
    	balance+=b;
    	System.out.println(""
    }
    void withdraw()
    {
    	double w;
    	System.out.println("Enter the amount to withdraw");
    	w=r.nextDouble();
    	balance-=w;
    	
    }
    void getbalance()
    {
    	System.out.println("Your balance is "+balance);
    }
}
class demo
{
	public static void main(String args[])
	{
		Scanner r=new Scanner(System.in);
		int c;
		account a1=new account("faraz",101,"sb",100);
		
		System.out.println("WELCOME TO BANK");
		do
		{
			System.out.println("Enter your choice");
			System.out.println("1-deposit");
			System.out.println("2-withdraw");
			System.out.println("3-show balance");
			System.out.println("4-exit");
			c=r.nextInt();
			switch(c)
			{
			case 1:a1.deposit();
			break;
			case 2:a1.withdraw();
			break;
			case 3:a1.getbalance();
			break;
			default:System.out.println("Invalid choice");
			}
			
		}while(c!=4);
	}
}


