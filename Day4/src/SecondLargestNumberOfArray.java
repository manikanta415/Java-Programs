
public class SecondLargestNumberOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,7,8,9};
		int temp;
		int size;
		size=arr.length;
		for(int i=0;i<=size-1;i++) {
			for(int j=0;j<=size-1;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("Second Largest number is:"+arr[size-2]);

	}

}
