package level3;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.nextLine();

        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        sc.nextLine();

        int[] res = {-1, -1};

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] + arr[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        System.out.print("Result indexes are: " + (res[0] + 1) + ", " + (res[1] + 1) );
    }
}
