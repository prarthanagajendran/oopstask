package oopstask;

public class Callemployee extends Employee{


		
		   Callemployee(int id, String firstname, String lastname, int salary) {
				super(id, firstname, lastname, salary);
           }
				
			public int getid(int id) {
				return id;
			}
			
			public String getfirstname(String firstname) {
				return firstname;
				
			}
			
			public String getlastname(String lastname) {
				return lastname;
				
			}
			
			public String getName() {
				return(firstName + " " + lastName);
			}
			
			public int getsalary(int salary){
				
				return salary;
				
			}
			
			public void setsalay(int salary) {
				this.salary = salary;
			}
			
			public int getAnnualsalary() {
				return (salary * 12);
			}
			
			public String toString() {
				
				
				return (id + " " + getName() + " " + salary);
			}
			
			public static void main(String[] args) {
				
			Callemployee obj = new Callemployee(101, "Prarthana", "Gajendran", 10000);
				
				System.out.println("Employee Id: "+obj.getid(101));
				System.out.println("Name of the employee: "+ obj.getName());
				System.out.println("Salary of the employee: "+ obj.getsalary(10000));
				obj.raiseSalary(50);
				System.out.println("Annual New salary of the employeed: "+obj.getAnnualsalary());
				System.out.println(obj.toString());
			}
		}


output
Employee Id: 101
Name of the employee: Prarthana Gajendran
Salary of the employee: 10000
Annual New salary of the employeed: 180000
101 Prarthana Gajendran 15000
	
