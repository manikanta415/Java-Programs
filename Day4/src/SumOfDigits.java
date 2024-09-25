
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=150;
		int sum=0;
		for(sum=0;num!=0;num=num/10) {
			sum=sum+num%10;
		}
		System.out.println("Sum of digits of given numbers is:"+sum);

	}

}
