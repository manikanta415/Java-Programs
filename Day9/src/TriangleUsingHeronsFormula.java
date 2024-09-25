
public class TriangleUsingHeronsFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=50f;
		float b=60f;
		float c=70f;
		float s=(a+b+c)/2;
		float res=(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle using heron's formula is:"+res);

	}

}
