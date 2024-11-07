
package assignment6;
import java.util.Scanner;
public class findnumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so phan tu mang:  ");
        int n= scanner.nextInt();
        int[] arr =new int[n];
        System.out.println("Nhap "+ n +" so nguyen: ");
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        findLargestAndSmallest(arr);
    }
         public static void findLargestAndSmallest(int[] arr) {
             if(arr.length == 0 ){
                 System.out.println("Mang trong!");
                 return;
             }
 
        int largest = arr[0];
        int smallest = arr[0];
        
       
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
