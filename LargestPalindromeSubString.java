package PracticeProgram;

import java.util.*;
public class LargestPalindromeSubString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String s : ");
		String s = sc.nextLine();
		System.out.println("Original String: " + s);
		int result = getLargestPalidromesubString(s);
		System.out.println("Largest Palindrome Length: " + result);
		sc.close();
	}

	public static int getLargestPalidromesubString(String s) {
		int maxlen = 0;
		for (int i = 0; i < s.length(); i++) {

			int oddsize = expendAroundcenter(s, i, i);
			int evensize = expendAroundcenter(s, i, i + 1);

			int max = oddsize > evensize ? oddsize : evensize;

			if (max > maxlen) {
				maxlen = max;
			}
		}
		return maxlen;
	}
	public static int expendAroundcenter(String s, int start, int end) {
		while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}
		return end - start - 1;
	}
}

