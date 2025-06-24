package New;

import java.util.Scanner;


public class Trenary {

    public static void main(String[] args) {

        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st no : ");
        a = s.nextInt();
        System.out.print("Enter 2nd no : ");
        b = s.nextInt();
        System.out.print("Enter 3rd no : ");
        c = s.nextInt();
        String result;
        result = (a>b&&a>c) ? "A is Greatest" : (b>c) ? "B is Greatest" : "C is Greatest";
        System.out.println(result);


    }
}
