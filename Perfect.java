package PracticeProgram;


public class Perfect {
	public static void main(String[] args) {
		boolean result =isPerfectNum(28);
		System.out.println("is Perfect :"+result);
	}
	public static boolean isPerfectNum(int n) {
		if(n< 6)
			return false;
		int sum =0;
		int i = 1;
		while(i <= n/2) {
			if(n%i==0)
				sum = sum+i;
			i++;
		}
		return n == sum;
	}
	
}
