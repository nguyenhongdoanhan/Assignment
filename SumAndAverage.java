
package assignment6;

import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        
        calculateSumAndAverage(arr);
    }
    
    public static void calculateSumAndAverage(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        double average = (double) sum / arr.length;
        
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
