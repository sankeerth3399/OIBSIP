package atm;
import java.util.*;

public class AtmInterface 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your pin");
	    int pin = sc.nextInt();
	    int amount = 500;
	    int amount2 = 1500;
	    String trans="";
	    if(pin == 1234)
	    {
	    	while(true) { 
	         System.out.println("WELCOME TO ATM SYSTEM");
	         System.out.println("---------------------");
	         System.out.println("Select option : ");
	         System.out.println("1. Transaction History");
	         System.out.println("2. Withdraw");
	         System.out.println("3. Deposit");
	         System.out.println("4. Transfer");
	         System.out.println("5. Exit");
	         System.out.print("Enter your choice : ");
	         int choice = sc.nextInt();       
	         
	         if(choice == 1)
	         {
	        	 System.out.println("*****Transaction History*****\n");
	        	 System.out.println("--------------------------------");
	     		if(trans=="")
	     			System.out.println("No transactions done so far");
	     		else
	     			System.out.println(trans); 
	         }
	         else if(choice == 2)
	         {
	        	 System.out.print("Enter  amount to withdraw: "); 
	        	 int x = sc.nextInt();
	        	 System.out.println("---------------------------");
	        	 if(amount >= x )
	        	 {
	        		System.out.println("Amount Rs"+x+"/-withdraw successfully");
	        		amount = amount-x;
	        		System.out.println("your Available Balance:"+amount);
	        		System.out.println("---------------------------");
	        		trans+="You Withdraw "+Float.toString(x)+" successfully \n";
	             }
	        	 else 
	        	 {
	        		 System.out.println("insufficient balance to withdraw the cash");
	                 System.out.println("---------------------------");
	        	 }
	         }
	         else if(choice == 3)
	         {
	        	 System.out.print("Enter  amount to deposit: "); 
	        	 int x = sc.nextInt();
	        	 System.out.println("---------------------------");
	        	 amount = amount+x;
	        	 System.out.println("Amount Rs"+x+"/- deposited successfully");
	        	 System.out.println("your Available Balance:"+amount);
	        	 trans+="You deposited "+Float.toString(x)+" successfully \n";
	        		System.out.println("---------------------------");
	 
	         }
	         else if(choice == 4)
	         {
	        	 System.out.print("Enter account number of receiver's bank: "); 
	        	 int acc_no = sc.nextInt();
	        	 System.out.print("Enter amount to transfer: ");
	        	 int x = sc.nextInt();
	        	 System.out.println("---------------------------");
	        	 if(amount>=x) 
	        	 {
	        		 System.out.println("Amount Rs"+x+"/- Transfered successfully");
	        		 amount-=x;
	        		 amount2+=x;
	        		 System.out.println("your Available Balance:"+amount);
	        		 trans+="You transfered "+Float.toString(x)+" successfully \n";
	        		 System.out.println("Available Balance of Transferd account:"+amount2);
	        	 }
	        	 else 
	        	 {
	        		 System.out.println("insufficient balance to Transfer");
	                 System.out.println("---------------------------");
	        	 }
	         }
	         else if(choice == 5) 
	         {
	        	 System.out.println("Thank you for using  ATM");
		    	 System.exit(0);
	         }
	         else 
	         {
	        	 System.out.println("Please Enter Correct option");
	         }
	      } 
	    	
	    	
	    }
	    else 
    	{
    		System.out.println("Incorrect! please enter correct pin");
    	}
         
	}

}
