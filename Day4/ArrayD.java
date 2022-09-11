import java.util.Scanner;
import java.lang.*;
public class ArrayD{
    public static void main(String[] args) {
        int A[][]=new int[5][5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter element");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(" "+A[i][j]+" ");
            }
            System.out.println("");
        }
    }
}