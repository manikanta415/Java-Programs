import java.util.Arrays;
import java.util.Collections;
public class AscendingAndDescendingOrder {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,10,6,12,1,5,8,3,11,7,4,9};
		Arrays.sort(arr);
		System.out.println("Elements of array is sorted ascending order:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
