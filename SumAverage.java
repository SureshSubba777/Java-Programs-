// import java.util.Scanner;
// class sum_avegare{
// class Main {
//     public static void main(String[] args) {
//         int n, sum = 0;
//         float average;
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the length of array");
//         n = s.nextInt();
//         int [] a = new int[n];
//         System.out.println("Enter the array:");
//         for (int i = 0; i<n;i++){
//             a[i] = s.nextInt();
//             sum += a[i];
//         }
//         System.out.println("Sum:"+ sum);
//         average = (float)sum/ n;
//         System.out.println("Average: "+average);
        
//         s.close();
        
//     }
// }}
import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        int n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum += a[i];
        }
        System.out.println("Sum: " + sum);
        average = (float) sum / n;
        System.out.println("Average: " + average);
        s.close();
    }}