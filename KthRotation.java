package PracticeProgram;

public class KthRotation {
	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60,70,80,90};
		
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
		kthRotation(a,1);
		for(int x:a) {
			System.out.print(x+" ");
		}
		
	}
	public static void reverse(int [] a, int start, int end) {
		
		while(start<end) {
		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;
		
		start++;
		end--;
		}		
	}
	public static void kthRotation(int [] a, int k) {
		
//		k=k%a.length;
		
		reverse(a,0,a.length-1);
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
		
	}
}
