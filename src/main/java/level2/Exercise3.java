package level2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Eter your string: ");
        String str = sc.nextLine();

        String res = "";

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(i==0)
                res += ch;
            else {
                boolean repeat = false;

                for(int j=i-1; j>=0; j--) {
                    char flag = str.charAt(j);
                    if (ch == flag) {
                        repeat = true;
                        break;
                    }
                }

                if(!repeat)
                    res += ch;
            }
        }

        System.out.println("The string with unique characters is: " + res);

    }

}
