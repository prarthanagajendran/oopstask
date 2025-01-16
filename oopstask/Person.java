package oopstask;

import java.util.Scanner;

public class Person {

	private String Name;
	private int Age;
	
	
	Person(String Name,int Age)//Constructor
	{
		
		this.Name=Name;
		this.Age=Age;
	}
		
		public String getName() {//getter method
	      return Name;
		}
		
		
		public int getAge() {
			return Age;
		}
		
	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the name of the person:");
		String Name=myObj.nextLine();
		
		
		Scanner myObj1=new Scanner(System.in);
		System.out.println("Enter the Age:");
		int Age=myObj.nextInt();
		
		Person Myperson = new Person(Name,Age);
		System.out.println("Name:"+Myperson.getName());
	    System.out.println("Age:" +Myperson.getAge());
	   
	    
	

	}

}




output
Enter the name of the person:
Prarthana
Enter the Age:
36
Name:Prarthana
Age:36

