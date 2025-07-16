
package sortings;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t,min;
        for(int i=0;i<n-1;i++){//iterations
            min=i;
            for(int j=i+1;j<n;j++){//2 20 10 6 5
                if(arr[min]>arr[j]){

                    t=arr[min];
                    arr[min]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println();
        for(int m=0;m<n;m++){
            System.out.println(arr[m]);
        }
    }
}
