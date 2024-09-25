
public class SumAllNegativeNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,7,8,9,0,-5,-4,-2};
        int sum = 0;   
        for (int i = 0; i < arr.length; i++) { 
        	if(arr[i]<=0) {
        		sum = sum + arr[i]; 
        	}
            
        }  
        System.out.println("Sum of all negative numbers in array:" +sum*1);

	}

}
