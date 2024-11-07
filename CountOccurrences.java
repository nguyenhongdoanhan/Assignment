
package assignment6;

import java.util.Scanner;

public class CountOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the integer to count occurrences of: ");
        int target = scanner.nextInt();
     
        int count = countOccurrences(arr, target);
        System.out.println("The number " + target + " appears " + count + " times in the array.");
    }
    
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        
        return count;
    }
}

