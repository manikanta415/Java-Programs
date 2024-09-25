import java.util.Scanner;

public class LaunchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select 1 to perform ADDITION");
		System.out.println("Select 2 to perform SUBTRACTION");
		System.out.println("Select 3 to perform MULTIPLICATION");
		System.out.println("Select 4 to perform DIVISION");
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			int a;
			int b;
			int c;
			switch(choice) {
			case 1: System.out.println("Enter first number");
			a = scan.nextInt();
			System.out.println("Enter second number");
			b = scan.nextInt();
			c = a+b;
			System.out.println(c);
			break;
			case 2: System.out.println("Enter first number");
			a = scan.nextInt();
			System.out.println("Enter second number");
			b = scan.nextInt();
			c = a-b;
			System.out.println(c);
			break;
			case 3: System.out.println("Enter first number");
			a = scan.nextInt();
			System.out.println("Enter second number");
			b = scan.nextInt();
			c = a*b;
			System.out.println(c);
			break;
			case 4: System.out.println("Enter first number");
			a = scan.nextInt();
			System.out.println("Enter second number");
			b = scan.nextInt();
			c = a/b;
			System.out.println(c);
			break;
			default: System.out.println("Invalid choice.Please re-enter (1-4)");
			
			}
		}

	}


