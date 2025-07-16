package sortings;
import java.util.Scanner;
public class QuickSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }  
        quick(0,n-1,arr);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static int partition(int low, int high, int arr[]){
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        while(true){
            while(i<=high && arr[i]<=pivot){
                i++;
            }
            while(j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }else{
                break;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
        
        
    public static void quick(int i, int j, int arr[]){
        if(i<j){
            int k=partition(i, j, arr);
            quick(i, k-1, arr);
            quick(k+1, j, arr);
        }
    }
}