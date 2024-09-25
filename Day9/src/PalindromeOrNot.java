
public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="dad";
		boolean flag=true;
		string = string.toLowerCase();
		for(int i=0;i<string.length()/2;i++) {
			if(string.charAt(i) !=string.charAt(string.length()-1)) {
				flag=false;
				break;
				
			}
		}
		if(flag) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not palindrome");
		}

	}

}
