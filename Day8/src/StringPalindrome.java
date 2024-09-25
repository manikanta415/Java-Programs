
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MOM";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		if(s.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
