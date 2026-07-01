package While_Loop;

public class Factor {
	public static void main(String[] args) {
		int n = 100;
		int i =1;
		int count=0;
		
		while(i < n) {
			if(n % i == 0) {
				System.out.print(i+" ");
				count++;
			}
			i++;
		}
		System.out.print("\nTotal Number of Count :"+count);
	}
}
