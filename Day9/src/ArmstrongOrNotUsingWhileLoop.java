
public class ArmstrongOrNotUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int r;
		int sum=0;
		int temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		n=temp;
		System.out.println(sum);
		if(n==sum) {
			System.out.println("Given number is armstrong:"+sum);
		}
		else {
			System.out.println("Given number is not armstrong:"+sum);
		}

	}

}
