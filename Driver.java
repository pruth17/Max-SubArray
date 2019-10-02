import java.io.*;
import java.util.Scanner;

public class Driver {

public static void main(String[] args) {
	
	int i = 0;
	int j = 0;
	Scanner inp = new Scanner(System.in);
	BruteForce p = new BruteForce();
	
	try {
	
	System.out.println("Enter the length of the array: ");
	int n = inp.nextInt();
	System.out.println("Enter the array ");

	int[] a = new int[n];
	
	for(j = 0; j < n; j++) {
		
		a[j] = inp.nextInt();
	}
	inp.close();
	
	int[] b = new int[n];
	int m = 0;
	//b = p.mixedrecursive(a,m,n-1);
	//System.out.println("The maximum subarray is: ");
	//for(i=0;i<b.length;i++) {
	//	System.out.println(b[i]+" ");
	//	}
	int x = p.mixedrecursive(a, 0, a.length-1);
	System.out.println(x);
		
			
			
			
	} catch (Exception e) {
	System.out.println("Exception: "+ e);
	}
	
	
	
}

}
