import java.util.Scanner;
import java.lang.*;

public class ArrayMm {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int C[][] = new int[3][3];
        System.out.println("Enter Matrix A's elements");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=Sc.nextInt();
            }
        }
        System.out.println("Enter Matrix B's elements");
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                B[i][j]=Sc.nextInt();
            }
         }

         for(int i=0;i<C.length;i++){
            for(int k=0;k<C[0].length;k++){
                C[i][k]=0;
                for(int j=0;j<C[0].length;j++){
                    C[i][k]=C[i][k]+A[i][j]*B[j][k];
                }
            }         
        }
        System.out.println("Added Matrix is : ");
        for(int i=0;i<C.length;i++){

            for(int k=0;k<C[0].length;k++){
                System.out.print(" "+C[i][k]+" ");
            }
            System.out.println("");
        }
    }
}
