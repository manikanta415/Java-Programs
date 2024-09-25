
public class ReverseStringUsingRecursion {
	static String revString(String n) {
		if(n.isEmpty()) {
			return "   ";
		}
		else {
			String remaining= n.substring(1);
			return revString(remaining)+n.charAt(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="manikanta";
		String reversed=revString(n);
		System.out.println(reversed);

	}

}
