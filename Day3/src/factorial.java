import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    if (n<0) {
			System.out.println("invalid");
		}
		else {
				int result = calculateFactorial(n);
				System.out.println(result);
			}
	}
	private static int calculateFactorial (int n) {
			// TODO Auto-generated method stub
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return n*calculateFactorial(n-1);

		}
	}

}
