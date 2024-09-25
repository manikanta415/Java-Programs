
public class SecondLargestAndSmallestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {39,73,65,19,10,89,50,40,20};
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
		System.out.println("Second Smalest number is:"+arr[1]);

	}

}
