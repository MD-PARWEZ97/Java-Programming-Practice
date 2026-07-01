package PracticeProgram;

public class Duplicate {
	public static void main(String[] args) {
		int [] a = {8,2,6,6,7,8,8,9,5};
		for(int x : a)
			System.out.print(x + " ");
		System.out.println("");
		freqDuplicate(a);
	}
	public static void freqDuplicate(int []a) {
		System.out.println("Frequency Element");
		int n = a.length-1;
		String duplicate="";
		for(int i =0; i<=n ; i++) {
			int count =1;
			for(int j =i+1; j<=n; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j] = a[n];
					n--;
					j--;
				}
			}
			System.out.println(a[i]+ " is: "+ count + " times");
			if(count > 1) {
				duplicate = duplicate + a[i] + " ";
			}
		}
		System.out.print("\nPrint Dplicate Value is : "+ duplicate);
	}
}
