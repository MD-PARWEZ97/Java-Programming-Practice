package PracticeProgram;

import java.util.*;

public class Palindromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isPalindromic(arr)) {
            System.out.println("Array is Palindromic");
        } else {
            System.out.println("Array is NOT Palindromic");
        }
    }

    public static boolean isPalindromic(int[] num) {
        int start = 0;
        int end = num.length - 1;

        while (start < end) {
            if (num[start] != num[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}
