//this is named as farmer.java and is present in Dairy2 package 

package Dairy2;

public class farmer//superclass
{
	String Name;//instance variables
	String Number;
	public farmer()//default constructor
	{
		Name="Aditya";
		Number="63614";
	}
	public farmer(String Name,String Number)//Parameterized constructor
	{
		this.Name=Name;//this keyword => to solve naming ambiguity
		this.Number=Number;
	}
	public farmer(farmer p)//Parameterized constructor with object as a parameter
	{
		this.Name=p.Name;
		this.Number=p.Number;
	}
	public void display()
	{
		System.out.println("Entered Name: "+Name);
		System.out.println("Entered Membership Number:"+Number);
		System.out.println();
	}
}