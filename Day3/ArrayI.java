public class ArrayI {
    public static void main(String[] args) {
        int A[]={5,1,2,3,4,8,9,10,12,13};
        
        int n=9;
        
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
     
        int x=20;
        int index=2;
        
        for(int i=n;i>index;i--)
            A[i]=A[i-1];
        A[index]=x;
        
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
    }
}
