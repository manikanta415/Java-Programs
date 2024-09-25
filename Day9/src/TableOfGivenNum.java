import java.util.Scanner;

public class TableOfGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=scan.nextInt(); 
		System.out.println("enter range:");
		int range=scan.nextInt();
		int i=1;
		while(i<=range) {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}

	}

}
