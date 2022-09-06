import java.util.Scanner;
public class OneD{
    public static void main(String[] args) {
       System.out.println("Enter the Size Of Array");
       Scanner sc=new Scanner(System.in);
       int s;
       s=sc.nextInt();
      int A[]=new int[s];
      for(int i=0;i<A.length;i++){
        System.out.println("Enter "+i+" index");
        A[i]=sc.nextInt();
      }
      System.out.print("Created Array:");

      for(int i=0;i<A.length;i++){
        System.out.print(" "+A[i]);
      }
    }
}