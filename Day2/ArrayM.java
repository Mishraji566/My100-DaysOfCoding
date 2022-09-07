import java.lang.*;
import java.util.Scanner;
public class ArrayM {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int A[]=new int[10];
    System.out.println("Enter the Array's Elements");
    for(int i=0;i<A.length;i++){
        A[i]=sc.nextInt();
    }
    int max=-214748;
    for(int i=0;i<A.length;i++){
        if(A[i]>max){
            max=A[i];
        }
    }
    System.out.println(max);
}
}
