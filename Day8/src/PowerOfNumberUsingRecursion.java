
public class PowerOfNumberUsingRecursion {
	static int power(int base,int exponent) {
		if(exponent==0) {
			return 1;
		}
		else {
			return base*power(base,exponent-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=2;
		int exponent=3;
		int res=power(base,exponent);
		System.out.println(res);

	}

}
