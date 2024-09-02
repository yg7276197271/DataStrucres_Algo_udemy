package sorting_algorithms;

//Time Complexity is O(n2)
public class SelectionSortImpl {

	//select minimums & swap is the algorithm
	
	//swap at index 0 & minimum element from 0 to n-1
	//swap at index 1 & minimum element from 1 to n-1
	//swap at index 2 & minimum element from 2 to n-1 And so on
	
	//swap at index n-2 & min element from n-2 to n-1
	//Hence outer loop will be 0 to n-2 & inner loop is from first element of outer loop to n-1
	
	
	public static void selection_sort(int[] arr,int n ){
		
		for(int i=0 ; i<= n-2;i++){
			
			int mini = i; 
			for(int j=i;j<=n-1;j++){
				
				if(arr[j] < arr[mini]){
					mini=j;
				}
			}
			//code for swapping
			int temp=arr[mini];
			arr[mini]=arr[i];
			arr[i]=temp;		
		}
	}
	
	public static void main(String[] args) {

		int arr[]={12,60,34,1,99,88,0,999,111};
		selection_sort(arr,arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"");
		}
	
	}
}
