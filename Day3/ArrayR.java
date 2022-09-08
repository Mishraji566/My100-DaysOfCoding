import java.lang.*;

public class ArrayR{
    public static void main(String[] args) {
        int A[]={4,5,6,7,8,9,10,1,11,15,18,16,19,20};
        int a=1;
        for(int i=0;i<A.length;i++){
            System.out.print(" "+A[i]);
        }
        int temp=A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
           A[A.length-1]=temp;  
           System.out.println(" ");
         for(int i=0;i<A.length;i++){
            System.out.print(" "+A[i]);
        }
       
    }
}