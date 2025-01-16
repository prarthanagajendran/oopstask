package oopstask;

public class Employee 
{
	
        int id;
		String firstName;
		String lastName;
		int salary;
		
		Employee(int id, String firstname, String lastname, int salary)
		{
			this.id = id;
			this.firstName = firstname;
			this.lastName = lastname;
			this.salary = salary;			
		}
		public void raiseSalary(int percent)
		{
			salary = salary + (salary * percent / 100);
			
		}
	}
	