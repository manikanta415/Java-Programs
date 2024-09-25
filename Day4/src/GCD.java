
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=12;
		int n2=8;
		while(n1 !=n2) {
			if(n1>n2) {
				n1=n1-n2;
			}
			else {
				n2=n2-n1;
			}
		}
		System.out.println("GCD of two numbers is:"+n2);

	}

}
