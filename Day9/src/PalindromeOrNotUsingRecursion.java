
public class PalindromeOrNotUsingRecursion {
	static int palindrome(int n,int temp) {
		if(n==0) {
			temp=(temp*10)+(n%10);
			return palindrome(n/10,temp);
		}
		
		return temp;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		int temp=palindrome(num,0);
		if(temp==num) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
