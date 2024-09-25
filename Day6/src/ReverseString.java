
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dhoni is a great batsman";
		String reversedStr="";
		for(int i=s.length()-1;i>=0;i--) {
			reversedStr=reversedStr+s.charAt(i);
		}
		System.out.println("original string:"+s);
		System.out.println("Reverse of string:"+reversedStr);

	}

}
