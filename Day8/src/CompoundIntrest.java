
public class CompoundIntrest {

	public static void main(String[] args) {
		//p(1+r/100),t
		float p=2000;
		float r=5.4f;
		float t=2;
		double si=p*(Math.pow(1+r/100, t));
		System.out.println(si);

	}

}
