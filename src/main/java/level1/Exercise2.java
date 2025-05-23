package level1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in your array: ");
        int n = sc.nextInt();
        sc.nextLine();

        if(n<2)
            System.out.print("Array less than 2 elements. Return special value: " + Integer.MIN_VALUE);
        else {
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                System.out.print("Element " + (i+1) + ": ");
                arr[i] = sc.nextInt();
            }
            sc.nextLine();

            int max = Integer.MIN_VALUE;
            int sec_max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++)
                max = Integer.max(max, arr[i]);

            for (int num : arr)
                if(num != max)
                    sec_max = Integer.max(sec_max, num);

            System.out.print("Second max is: " + sec_max);
        }



    }
}
