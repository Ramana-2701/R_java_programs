package New;

import java.util.Scanner;

public class Palin_Num {

    public static void main(String[] args) {

        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        int c ;
        int d = 0;
        int r=a;
        while (a != 0) {

            c = a % 10;
            d = (d * 10) + c;
            a = a / 10;

        }
        System.out.println(d);
        if (r == d) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
