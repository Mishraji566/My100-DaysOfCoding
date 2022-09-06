import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int s;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Array Size");
        s=sc.nextInt();
        int A[]=new int[s];
        for(int i=0;i<A.length;i++){
            System.out.print("Enter Digits "+i+" : ");
            A[i]=sc.nextInt();
        }
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        System.out.println("Sum is : "+sum);

    }
}
