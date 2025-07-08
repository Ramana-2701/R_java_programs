package New;

import java.util.Arrays;

import java.util.Scanner;

public class Multi_Arr {

    public static void main(String[] args) {

        int a,b;
        int x=0;
        System.out.print("Enter the Rows : ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.print("Enter the Columns : ");
        b = s.nextInt();
       // int[][] arr = {{1,2,3},{4,5,6}};
       // System.out.println(Arrays.deepToString(arr));
        int[][] arr1 = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){

               arr1[i][j] = s.nextInt();
            }
        }
        for(int j=0;j<b;j++){
            System.out.print("j("+ j + ") ");
        }
        System.out.println();
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                //System.out.println("j ");
                System.out.print(arr1[i][j] + "    ");
            }
            System.out.println("i ");
        }
        System.out.println("Printing the Diagonals");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
               if(i==j)
                   System.out.print(arr1[i][j] + " ");
               else
                   System.out.print("* ");
            }
            System.out.println();

        }





    }
}
