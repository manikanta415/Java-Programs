
public class ProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,6,};
        int sum = 1;   
        for (int i = 0; i < arr.length; i++) { 
        	if(arr[i]>=0) {
        		sum =sum*arr[i]; 
        	}
            
        }  
        System.out.println("Sum of all the elements of an array: " +sum);

	}

}
