
public class UseStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Mahendra Singh Dhoni");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("is a great batsman");
		System.out.println(sb);

	}

}
