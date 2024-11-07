
package assignment6;
import java.util.Arrays;
import java.util.Scanner;
public class SortArrayAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Nhap " + n + " so nguyen:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        sortArrayAscending(arr);
        System.out.println("Mang sau khi sap xep tang dan: " + Arrays.toString(arr));
    }
    
    public static void sortArrayAscending(int[] arr) {
        Arrays.sort(arr);
    }
}


