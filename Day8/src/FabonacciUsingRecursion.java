
public class FabonacciUsingRecursion {
	static void fabonacci(int n) {
		int n1=0;
		int n2=1;
		System.out.println(n1+" "+n2+" ");
		for(int i=0;i<=n;i++) {
			int n3=n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fabonacci(12);

	}

}
