package level1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String inputString = sc.nextLine();
        inputString = inputString.toUpperCase();

//        Solution 1: use split()
//        String splitString[] = inputString.split(" ");
//        for(String s : splitString)
//            System.out.println(s);
//
//        for (int i=0; i<splitString.length; i++)
//            System.out.print(splitString[i].charAt(0) + " ");

//        Solution 2: build from scratch
        for (int i=0; i<inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if(i==0)
                System.out.print(ch + " ");
            else {
                char prev_ch = inputString.charAt(i-1);
                if(prev_ch == ' ')
                    System.out.print(ch + " ");
            }
        }
    }
}
