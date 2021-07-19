//N Aditya Bhat  4NI19IS051  ASection
//This is named as Dairy1.java and is in the Dairy package
package Dairy;
import java.util.Scanner;
import Dairy2.*; //importing of packages

class quantity extends farmer          //single inheritance
{
	int n;
	
	quantity()
	{
		n=0;
	}
	quantity(farmer p,int n)
	{
		super(p);
		this.n=n;
	}
	public void display()
	{
		System.out.println();
		super.display();//'super' keyword => calls display() of superclass farmer
		System.out.println("You have supplied "+n+" litres of milk per day.");
		System.out.println();
	}
}
class payment extends quantity         //multilevel inheritance
{
	int x;
	payment()
	{
		x=15;//set by the union
	}
	void paymentinfo(int n)
	{
		this.n=n;
		System.out.println("Cost offered per litre(Fixed for this month) = "+x+" rupees");
		System.out.println("You will recieve the following amount = " +(n*x)*30+" rupees");
		System.out.println();
		System.out.println("Once verified, transaction will be initiated to your registered account very soon!!");
		System.out.println("Incase of any clarifications, please contact the union office(phone no: 0824-2567898).");
		System.out.println("Thank You :)");
	}
}
 
//=======================================================================================================================================

class customer
{
	public String Name;
	String Number;
	customer()
	{
     	Name="Aditya";
		Number="63614";	
	}
	customer(String Name,String Number)
	{
		this.Name=Name;
		this.Number=Number;
	}
	void show()  
	{
		System.out.println("Entered Name: "+this.Name);
		System.out.println("Entered Membership Number:"+this.Number);
		System.out.println();
	}
	private void msg()//since 'private' it cannot be used anywhere outside this class
	{
		System.out.println("We give you the best deal.");
	}
}
class quantity2 extends customer
{
	int m;
	
	void show(String CName,String CNumber)
	{
		this.Name=CName;
		this.Number=CNumber;
		super.show();
	    System.out.println("Mr "+CName+" ,please enter the quantity of milk you would want to buy from the union (in liters/day)");
	}
}
class payment2 extends quantity2
{
	int y;
	
	payment2()
	{
		y=35;//set by the milk union
	}
	void show(int n)
	{
		int x=n;
		System.out.println("Current price per litre(fixed for this month) = "+y+" rupees");
		System.out.println("You will have to pay = " +(x*y)*30+" rupees");
		System.out.println();
		System.out.println("Amount will be deducted from your registered account.The produce will be delivered to "
				+ "your registered address.");
		System.out.println("Delivery details and time will be intimated to you very soon.");
		System.out.print("Incase of any clarifications, please contact the union office(phone no: 0824-2567898).");
		System.out.println("Thank You :)");
	}
}

//=======================================================================================================================================

interface inter1//interface
{
	void netprofit();
	
}
class Netprofit implements inter1//interference implementation
{
	public void netprofit()
	{
		System.out.println();
		System.out.println("Net Profit of the union will be out soon :)");
		System.out.println("Contact union office to become a member of the union(phone no: 0824-2567898)!! "
				+ "Apply today...get attractive benefits tomorrow");
	}
}

//=======================================================================================================================================
public class Dairy1 {

	public static void main(String[] args) 
	{
		
		System.out.println("\t\t\t\t\t** Welcome to Angel Dairy Management System **");
		System.out.println();
		
		System.out.println("Type 'One' if you are a farmer who wants to sell his milk produce to the union.");
		System.out.println("Type 'Two' if you are a wholesale buyer of milk.");
		
		Scanner sc=new Scanner(System.in);
		String i=sc.nextLine();
		
		if(i.equalsIgnoreCase("One"))//String Handling
		{
			System.out.println();
			System.out.println("You are a farmer");
		    
			System.out.println("Enter your Name:");
			String FName=sc.nextLine();
			
			System.out.println("Enter your Membership Number:");
			String FNumber=sc.nextLine();
			
			farmer farmer=new farmer(FName,FNumber);//declaring objects
			
			System.out.println();
			System.out.println("Enter the quantity of milk you supplied to the union (in liters/day)");
			int n=sc.nextInt();
			
			quantity milk=new quantity(farmer,n);//passing object as parameter
			milk.display();//over riding 
		    
			payment payment = new payment();
			payment.paymentinfo(n);
        }
		
		else if(i.equalsIgnoreCase("Two"))
		{
			System.out.println();
			System.out.println("You are an wholesale buyer:");
			
			
			System.out.println("Enter your Name:");
			String CName=sc.nextLine();
			
			System.out.println("Enter your Membership Number:");
			String CNumber=sc.nextLine();
			
			customer customer=new customer(CName,CNumber);
			//customer.msg();=>not visible
			System.out.println();
			
			quantity2 q=new quantity2();
			q.show(CName,CNumber);//over loading 
			
			int m=sc.nextInt();
			System.out.println();
			System.out.println("Your request is being processed.");
			payment2 payment2 = new payment2();
		    payment2.show(m);
		}
		else
		{   //Exception Handling 
			try
			{
				throw new ArithmeticException();
			}
			catch(ArithmeticException e)
			{
				System.out.println("Invalid option");
			}
		}
//=======================================================================================================================================		
		
		inter1 obj=new Netprofit();//Creating reference to the interface
		obj.netprofit();
		
//=======================================================================================================================================		
		
		new MyThread("More");//child thread creation call
		
	}

}
