
public class AverageofElementsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,30,10,40,50,60};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
			int average=sum/arr.length;
			System.out.println("Average of elements in an Array is:"+average);

	}

}
