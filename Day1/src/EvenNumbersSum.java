public class EvenNumbersSum {
	public static void main(String[] args) {
		int i;
		int sum=0;
		for(i=2;i<=100;i=i+2) {
			sum=sum+i;
			System.out.println(i);
		}
		System.out.println(sum);
	}
}
