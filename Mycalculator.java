import java.util.Scanner;

public class Mycalculator {
	int a, b;
	Scanner sc = new Scanner (System.in);
	
	
	  int addition() {
		  System.out.println("enter two numbers for addition : ");
		  a = sc.nextInt();
		  b = sc.nextInt();
		  return(a+b);
		   
	  }
	  int substraction() {
		  System.out.println("enter two numbers for substraction : ");
		  a = sc.nextInt();
		  b = sc.nextInt();
		  return(a-b);
	  }
	int Multiplication() {
		System.out.println("enter two numbers for multiplication :  ");
		a = sc.nextInt();
		b = sc.nextInt();
		return (a*b);
	}
	int division() {
		System.out.println("enter two numbres for division :  ");
		a = sc.nextInt();
		b = sc.nextInt();
		return(a/b);
				
	}
	void Normal (){
		System.out.println("1: addition ");
		System.out.println("2:substraction");
		System.out.println("3:division");
		System.out.println("4: multiplication");
		System.out.println("Enter the number:  ");
		int choice = sc.nextInt();
		int ans = 0;
		switch(choice) { 
		case 1:
	      ans = addition();
	      break;
			
		case 2:
			ans = substraction();
			break;
			
		case 3:
			ans = Multiplication();
			break;
			
		case 4:
			ans = division();
			break;
			
		 default:
			 System.out.println("wrong input");
			 break;
		}
		

		System.out.println("ans =" +ans);
		
	} 
	int power(){
		System.out.println("enter two numbers for power");
		a = sc.nextInt();
		b= sc.nextInt();
		  return( (int) (Math.pow(a, b)));
		
	}
	int squareRoot() {
		System.out.println("enter a numbers for square :  ");
		a = sc.nextInt();
		 return( (int) Math.sqrt(a));
	}
	
int Maximum() {
	System.out.println(" enter a two  numbers for maximum : ");
	a = sc.nextInt();
	b = sc.nextInt();
	return ((int) Math.max(a, b) );
	
}
int minimum(){
	System.out.println("enter a two numbers for minimum : ");
	a = sc.nextInt();
	b = sc.nextInt();
	return( (int) Math.min(a, b));
}
		
	
	void Scientific() {
		System.out.println("1: power ");
		System.out.println("2 :squre root ");
		System.out.println("3: maximum");
		System.out.println("4 : minimum");
		System.out.println("enter your choice: ");
		int choice = sc.nextInt();
		int ans = 0; 
		switch(choice) {
		case 1:
		ans = power();
		break;
		
		case 2:
			ans = squareRoot();
			break;
			
		case 3:
			ans  = Maximum();
			break;
			
		case 4:
			ans  = minimum();
			break;
			
			default:
				System.out.println("invalid input");
				
		
		}
		System.out.println("Answer =" +ans);
		
	}




	   
	public static void main(String args[] ) {
		Scanner sc  = new Scanner(System.in);
		Mycalculator obj = new Mycalculator();
		 System.out.println("1: normal calculator : ");
		 System.out.println("2: scientific calculator: ");
		 System.out.println("enter the choice:  ");
		 int choice = sc.nextInt();
		 switch(choice) {
		 case 1:
			 obj.Normal();
			 break;
		 case 2:
			 obj.Scientific();
			 break;
			 default:
				 System.out.println("wrong selection");
				 break;
				 
			 
			 
			 
		
		}
	


	
	}

}
