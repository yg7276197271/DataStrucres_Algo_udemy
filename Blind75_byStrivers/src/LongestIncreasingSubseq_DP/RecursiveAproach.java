package LongestIncreasingSubseq_DP;

public class RecursiveAproach {
//Here we have to express recursion in terms of index and previous inex.Because we need to form increasing subsequence
	
	public static int calculate_longestSubsequence(int arr[],int index,int prev_index){
		
		int length =0;
		//Base Case 
		if(index == arr.length){
			return 0;
		}
		//Not Take
		 length= 0 + calculate_longestSubsequence(arr,index+1,prev_index);
		//Take
		if(prev_index == -1 || arr[index] > arr[prev_index] ){ //-1 means it first element
			length = Integer.max(length,  1+ calculate_longestSubsequence(arr,index+1,index));

		}
		return length;
	}
	
	public static void main(String[] args) {
	
		System.out.println(calculate_longestSubsequence(new int[]{5 ,4 ,11, 1 ,16, 8},0,-1));;
		System.out.println(calculate_longestSubsequence(new int[]{1,2,2},0,-1));;

	}
}
