package level2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual salary (in million VND currency unit): ");
        double salary = sc.nextDouble();

        double pay = 0;

        double[] arr = {    0,  5,  10,     18,     32,     52,     80};
        double[] rate = {0.05, 0.1, 0.15,   0.2,    0.25,   0.3,    0.35};

        for(int i=arr.length-1; i>=0; i--) {
//            System.out.print("range: " + arr[i] + ", ");
            double tax=0;
            if(salary > arr[i]) {
                double range = salary - arr[i];
                tax = range * rate[i];
                pay += tax;
                salary = arr[i];
            }
//            System.out.println(tax);
        }
        System.out.print("Total tax paid: " + pay + " million VND");



    }
}
