package sortings;
import java.util.Scanner;
public class MergeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array:");
        int n =  sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements");
        for(int i=0; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        split(0, n-1, arr);
        for(int i=0; i<n ; i++){
            System.out.println(arr[i]);
        }

    }  
    public static void split(int low,int high,int arr[]){
        int mid;
        if(low<high){
            mid=(low+high)/2;
            split(low,mid,arr);
            split(mid+1,high,arr);
            conquer(low, mid,high,arr);
        }
    } 
    public static void conquer(int low,int mid,int high,int arr[]){
        int newarr[]=new int[arr.length];
        int i=low;
        int j=mid+1;
        int h=low;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                newarr[h] = arr[i];
                i++;
            }else{
                newarr[h] = arr[j];
                j++;
            }
            h++;
        }
        if(i<=mid){
            for(int a=i; a<=mid; a++){
                newarr[h] = arr[a];
                h++;
            }
        }
        else{
            for(int a=j; a<=high; a++){
                newarr[h] = arr[a];
                h++;
            }
        }
        for(int z=low; z<=high; z++){
            arr[z]=newarr[z];
        }
    }
}
