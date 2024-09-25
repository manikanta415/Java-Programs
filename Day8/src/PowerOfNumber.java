
public class PowerOfNumber {

	public static void main(String[] args) {
		int base=4;
		int exponent=5;
		int result=1;
		while(exponent!=0) {
			result=result*base;
			--exponent;
		}
		System.out.println(result);

	}

}
