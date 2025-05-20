package level1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine();

        int sum = 0;
        for (int i=2; i<=n; i+=2)
            sum += i;

        System.out.println("The result sum is: " + sum);
    }
}
