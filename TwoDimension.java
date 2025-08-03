import java.util.*;
public class TwoDimension {
    public static void main(String[] args) {
        int [][] a = new int[3][3];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array: ");
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                a[i][j] = s.nextInt();
            }
        }
         for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                 System.out.println("Value of array are: \n");
                 System.out.println(a[i][j]+" ");  
            }
           System.out.println();
        }
        s.close();


    }
}
