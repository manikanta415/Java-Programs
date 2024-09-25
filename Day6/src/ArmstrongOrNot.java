
public class ArmstrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int r;
		int sum=0;
		int temp;
		temp=num;
		while(num>0) {
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
			
		}
		num=temp;
		System.out.println(sum);
		if(num==sum){
			System.out.println(sum+"is Armstrong");
		}
			else {
			System.out.println(sum+"is not Armstrong");
			}

	}

}
