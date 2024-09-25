import java.util.Arrays;

public class ReverseOfArray {

	public static void main(String[] args) {
		int arr[]= {6,5,4,3,2,1};
		System.out.println(Arrays.toString(arr));
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
