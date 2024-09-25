import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,7,6,5,4,3,2,1};
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
