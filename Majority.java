package PracticeProgram;

import java.util.NoSuchElementException;

public class Majority {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,7,7,7,7,7,7,7,7,7,7,7};
		System.out.print("Orignal Arrays is :");
		for(int x: a)
			System.out.print(" "+x);
		try {
			int result=majorityElem(a);
			System.out.println("\nMajority Element is :"+result);
		}catch(NoSuchElementException e) {
			System.out.println("\n"+e.getMessage());
		}
		
	}
	public static int majorityElem(int []a) {
		int max=a[0];
		int min=a[0];
		for(int x:a) {
			if(x > max)
				max=x;
			else if (x<min)
				min = x;
		}
		int [] freq = new int [max-min+1];
		for(int x: a)
			freq[x-min]++;
		for(int i=0; i<freq.length;i++) {
			if(freq[i]>a.length/2)                          // majority element > n/2
				return i+min;
		}
		throw new NoSuchElementException("No Majority Element found :");
	}
}
