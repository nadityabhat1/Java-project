//this is named as thread.java and is present in the Dairy package

package Dairy;
import java.util.Scanner;

class MyThread implements Runnable//creation of threads by implementing runnable
{
    Thread s;
	String name;    
	MyThread(String threadname)
	{
		name=threadname;
		s=new Thread(this,name);
		s.start();//call for run()
	}
	
	public void run()//child thread entry 
	{
		try                  
		{
			System.out.println();
			System.out.println("Would you like to know more about this union?? Yes/No");
			Scanner sc=new Scanner(System.in);
			String a=sc.nextLine();
			if(a.equals("Yes"))
			{
				System.out.println();
				System.out.println("About us ::");
				System.out.println("This union was setup in the year 1990 by the Bhuvan Brothers.");
				System.out.println("Started with the main motive of bridging the farmer-wholesaler gap,");
				System.out.println("the union today provides employeement to nearly 100 people and involved ");
				System.out.println("in various socio-economic activities.On a whole this union has been a great success story!!");
				System.out.println();
				System.out.println("Thank You Once Again");
			}
			else
			{
				throw new InterruptedException();
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thank You Once Again");
		}
	}
}


