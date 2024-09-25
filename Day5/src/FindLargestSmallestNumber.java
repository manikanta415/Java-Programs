
public class FindLargestSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,9,30,40,45,50,90,};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else if(arr[i]<smallest){
				smallest=arr[i];
			}
		}
		System.out.println("largest number is:"+largest);
		System.out.println("smallest number is:"+smallest);

	}

}
