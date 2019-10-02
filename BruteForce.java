import java.io.*;

public class BruteForce {
	
	public BruteForce() {
		
	}
	
	// Brute Force Algorithm
	
	public static int bruteforce(int a[], int n) {
		 int max = Integer.MIN_VALUE;
		
		
	    for ( int i = 0; i < n; i++ ) {
	            
	        int sum = 0;
	        for ( int j = i; j < n; j++ ) {
	        	 sum += a[j];
	        	 
	        	 if ( sum >= max ) {
	                 max = sum;
	               
	             }    
	             
	        }
	    }
	    
	    
	    
	    return max;
	        
		
	}
	
	// Recursive Maximum Array code
	
	public static int maxSubArraySum(int arr[], int l,  int h) 
{ 
		// Base Case: Only one element 
		if (l == h) 
			return arr[l]; 

		// Find middle point 
		int m = (l + h)/2; 



			return Math.max(Math.max(maxSubArraySum(arr, l, m), 
					maxSubArraySum(arr, m+1, h)), 
					maxCrossingSum(arr, l, m, h)); 
} 
	public static int maxCrossingSum(int arr[], int l, 
            int m, int h) 
{ 
// Include elements on left of mid. 
		int sum = 0; 
		int left_sum = Integer.MIN_VALUE; 
		for (int i = m; i >= l; i--) 
		{ 
			sum = sum + arr[i]; 
			if (sum > left_sum) 
				left_sum = sum; 
		} 

		// Include elements on right of mid 
		sum = 0; 
		int right_sum = Integer.MIN_VALUE; 
		for (int i = m + 1; i <= h; i++) 
		{ 
			sum = sum + arr[i]; 
			if (sum > right_sum) 
				right_sum = sum; 
		} 

		// Return sum of elements on left 
		// and right of mid 
		return left_sum + right_sum; 
	} 

		
	// mixed algorithm 
	// By modifying the recursive function to call 
	// the brute force method from the first code 
	//when it reaches crossover point.
	
	public static int mixedrecursive(int a[],int l, int h) {
		
		int crossover_point = 20;
		if(a.length < crossover_point)
			return bruteforce(a,a.length);
		else
			return maxSubArraySum(a, 0, a.length-1);
			
		
		
		
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}