import java.lang.*;
import java.util.Scanner;
public class ArraySe{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Element");
    int key=sc.nextInt();
    int A[]={5,8,9,12,15,2,6,1};

    for(int i=0;i<A.length;i++){
        if(key==A[i]){
            System.out.print("Element "+A[i]+" At : "+i+" index");
            break;
        }
        else {
            System.out.println("Element Not Found");
            break;
        }
    }
}
}