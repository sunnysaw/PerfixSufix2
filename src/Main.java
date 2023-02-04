/*
Question : Given an array of integers of size n. Answer q queries where you need to print the sum
           of values in a given range of indices from l to r(both included).
___________________________________________________________________________________________________
NOTE : The values of 1 and r in queries follow l-based indexing.
 */
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY :");
        int a = sc.nextInt();
        int[] arr = new int[a + 1];
        System.out.println("ENTER THE ELEMENT OF ARRAY :");
        for (int i = 1; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("FIRST, PRINTING THE ORIGINAL VALUE OF ARRAY :");
         for (int j : arr) {
             System.out.print(" " + j);
         }
        System.out.println();
        System.out.println("ENTER THE FIRST NUMBER FOR STARTING THE CALCULATION : ");
        int start = sc.nextInt();
        System.out.println("ENTER THE LAST NUMBER FOR ENDING THE CALCULATION : ");
        int end = sc.nextInt();
         System.out.println("NOW PRINTING THE RANGE OF NUMBER :");
         for (int i = start; i <= end; i++){
                 arr[i] = arr[i - 1] + arr[i];
                 System.out.print(" " + arr[i]);
                 start++;
         }
    }
}