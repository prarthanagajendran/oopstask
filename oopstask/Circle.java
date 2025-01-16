package oopstask;

public class Circle {

	
		
		int radius;
		float result, pi;
		
		public Circle() 
		{
			pi = 3.14f;
			radius = 0;
			
		}
		public Circle(int a , float b ) {
			
			radius = a;
			pi = b;
		}
		public void cal_circumference() {
			
			result= 2 * pi * radius;
			System.out.println("Circumferance is "+result);
			
		}
		public static void main(String[] args) {
			
			Circle cir = new Circle(2, 3.14f);
			cir.cal_circumference();
		}
	
	
	}


output
Circumferance is 12.56

