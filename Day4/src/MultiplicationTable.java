import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the NUmber:");
		int n=scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"=" +n*i);
		}

	}

}
