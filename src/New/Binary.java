package New;

import java.lang.String;

import java.util.Scanner;

public class Binary {

    public static void binary(int y){
        int i=0;
        int[] n = new int[1000];
        while(y>0){
            n[i] = y%2;
            i++;
            y=y/2;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(n[j]);
        }
    }

    public static void main(String[] args) {

       int a;
       Scanner s = new Scanner(System.in);
       a = s.nextInt();
       System.out.println("Decimal : " + a);
       System.out.println("Binary : ");
       binary(a);
    }


}
