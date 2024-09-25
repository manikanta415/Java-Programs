
public class MaxAndMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {64,128,8,32,16,4};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
			System.out.println("The maximum number is:"+max);
			System.out.println("The minimum number is:"+min);

	}

}
