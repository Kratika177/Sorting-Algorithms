
public class Solution {
	
	public static void quickSort(int[] input,int startIndex, int endIndex) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 if(startIndex<endIndex){
			 int pIndex=partition(input,startIndex,endIndex);
			 quickSort(input,startIndex,pIndex-1);
			 quickSort(input,pIndex+1,endIndex);
		 }

		
	}
	public static int partition(int[] arr,int low,int high){
		int i=low,j=high;
		int pivot=arr[low];
		while(i<j){
			while(arr[i]<=pivot && i<=high-1){
				i++;
			}
			while(arr[j]>pivot && j>=low){
				j--;
			}
			if(i<j){
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
			else{
				int t=arr[low];
				arr[low]=arr[j];
				arr[j]=t;
			}
		}
		return j;
	}
	
}
