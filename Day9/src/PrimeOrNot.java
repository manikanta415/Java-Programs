
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		boolean f=false;
		for(int i=2;i<=n/2;i++) {
			if(n% i==0) {
				f=true;
				break;
			}
		}
		if(!f) {
			System.out.println("Given num is a prime number:"+n);
		}
		else {
			System.out.println("Given num is not a prime number:"+n);
		}

	}

}
