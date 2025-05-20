package level2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();

        boolean pad = true;

//        if (str.length()%2 == 0) {
//            int mid = str.length()/2 - 1;
//            for (int i = 1; i <= mid; i++) {
//                if (str.charAt(mid-i+1) != str.charAt(mid + i)) {
//                    pad = false;
//                    break;
//                }
//            }
//        } else {
//            // madam
//            int mid = str.length()/2;
//            for (int i=1; i <= mid; i++) {
//                if(str.charAt(mid-i) != str.charAt(mid+i)) {
//                    pad = false;
//                    break;
//                }
//            }
//        }

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                pad = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(pad);

    }
}
