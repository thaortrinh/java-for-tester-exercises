package level1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();

        String[] splits = str.split(" ");

        int count = splits.length;
        System.out.print("Number of words count in the string is: " + count);

    }

}
