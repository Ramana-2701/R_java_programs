package New;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {




                String str , rStr = "";

                Scanner s =new Scanner(System.in);

                System.out.print("Enter the String ");
                str = s.nextLine();

                int strLength = str.length();

                for (int i = (strLength - 1); i >=0; --i) {
                    rStr = rStr + str.charAt(i);
                }

                if (str.equals(rStr)) {
                    System.out.println(str + " is a Palindrome String.");
                }
                else {
                    System.out.println(str + " is not a Palindrome String.");
                }


    }
}
