import java.util.Scanner;

public class FibonancciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); {
			int terms;
			System.out.println("Enter the terms:");
			terms=scan.nextInt();
			int n1=0;
			int n2=1;
			int n3;
			System.out.println(n1);
			System.out.println(n2);
			for(int i=2;i<=terms;i++) {
				n3=n1+n2;
				System.out.println(n3+" ");
				n1=n2;
				n2=n3;
				
			}
		}
		
	}

}
