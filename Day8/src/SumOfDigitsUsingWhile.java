//Sum of digits using while loop
public class SumOfDigitsUsingWhile {

	public static void main(String[] args) {
		int num=56789;
		int digit;
		int sum=0;
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("The sum of number is:"+sum);

	}

}
