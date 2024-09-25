
public class MultiplyTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= {{4,4,4,},{3,3,3},{2,2,2}};
		int arr2[][]= {{4,4,4,},{3,3,3},{2,2,2}};
		int arr3[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr3[i][j]=0;
				for(int k=0;k<3;k++) {
					arr3[i][j]=arr1[i][k]*arr2[k][j];
				}
				System.out.println(arr3[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
