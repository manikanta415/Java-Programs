
public class SwapTwoNumUsingBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=250;
		int y=350;
		System.out.println("Before swapping two numbers bitwise XOR operator:"+x+" "+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("After Swapping two numbers bitwise XOR operator:"+x+" "+y);


	}

}
