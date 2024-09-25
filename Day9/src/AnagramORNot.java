import java.util.Scanner;
import java.util.Arrays;

public class AnagramORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first String:");
		String s1=scan.next();
		System.out.println("Enter the Second String:");
		String s2=scan.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=ch2[i]) {
				System.out.println("Given strings are not anagram to each otehr");
				System.exit(0);
			}
		}
		System.out.println("Given strings are anagram to each other");

	}

}
