package New;
import java.util.Scanner;
import java.util.Arrays;
public class Non_Leading_Diag {

    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Rows : ");
        a = s.nextInt();
        System.out.print("Enter the Columns : ");
        b = s.nextInt();
        int[][] arr = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){

                arr[i][j] = s.nextInt();
            }
        }
        int d=a-1;
        int e = 0;
        int r =0;
        while(d>=0){
            while(e<=r){
                System.out.print(arr[e][d] +" ");
                e++;
            }
            r++;
            d--;
        }
    }
}
