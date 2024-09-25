
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="MahendraSinghDhoni";
		String s2="Dhoni";
		String s3="Dhoni";
		System.out.println(s1.indexOf('g'));
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.substring(5,11));
		if(s2.equals(s3)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are Unequal");
		}
	}

}
