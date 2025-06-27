package searchings;
import java.util.Scanner;
public class LinearSearchEx {
    public static void main(String[] args) {
        int [] a =new int[20];
        int n,x,i,k=0;
        Scanner sc=new Scanner(System.in);        
        System.out.println("Enter the number of elements:");
        n=sc.nextInt();
        System.out.println("Enter the elements:");  
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        x=sc.nextInt();
        k=sequentialSearch(a,n,x);
        if(k!=-1)    
        {
            System.out.println("Element found at index: "+k);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
    public static int sequentialSearch(int a[],int n,int x)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                return i ; 
                
            }
        }
        return -1; 
    }
    public static int sequentialSearchRecursive(int a[], int n, int x, int i) {
        if (i >= n) {
            return -1; 
        }
        if (a[i] == x) {
            return i; 
        }
        return sequentialSearchRecursive(a, n, x, i + 1); 
    }
}
