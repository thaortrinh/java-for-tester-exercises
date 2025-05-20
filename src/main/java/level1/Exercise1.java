package level1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your string: ");
        String inputString = sc.nextLine();
        String filteredString = "";
        for (int i=0; i<inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == 'u' | ch == 'e' | ch == 'o' | ch == 'a' | ch == 'i') {
                continue;
            } else {
                filteredString += ch;
            }
        }
        System.out.println("The filtered string is: " + filteredString);

    }
}