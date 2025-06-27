import java.util.*;
public class HallowRectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=1;i<=m;i++){
                if(i==1 || i==m){
                    for(int j=1;j<=n;j++){
                        System.out.print("* ");
                    }
                }
                else{
                    for(int j=1;j<=n;j++){
                        if(j==1 || j==n){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                }
            System.out.println();
        }
    }
}