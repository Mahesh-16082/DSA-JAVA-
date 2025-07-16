package sortings;
import java.util.Scanner;
public class InsertionSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1; i<n; i++){
            int key=arr[i],j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>key){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
                
            }
            arr[j+1]=key;
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

}
