package New;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        System.out.print("Please Enter the Rows : ");
        int rows = s.nextInt();
        for(int i=rows;i>=1;i--){
            for(int cols=1;cols<=i;cols++){
                System.out.print(" * ");
            }
            System.out.println();
            rows--;
        }
    }
}
