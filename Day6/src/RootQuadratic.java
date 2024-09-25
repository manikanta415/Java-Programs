
public class RootQuadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11;
		int b=55;
		int c=66;
		double discriminant=b*b-4*a*c;
		double x1=(-b+Math.sqrt(discriminant))/(2*a);
		double x2=(-b-Math.sqrt(discriminant))/(2*a);
		System.out.println(x1);
		System.out.println(x2);

	}

}
