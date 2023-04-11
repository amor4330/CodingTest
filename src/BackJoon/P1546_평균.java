package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1546_평균 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

//        int max = 0;
//        for (int i = 0; i < N; i++) {
//            if(arr[i] > max) max = arr[i];
//        }
//
//        double sum = 0;
//        for (int i = 0; i < N; i++) {
//                sum += (arr[i] / (double) max) * 100;
//        }

        int max = 0, sum = 0;

        for (int i = 0; i < N; i++) {
            if(arr[i] > max) max = arr[i];
            sum += arr[i];
        }

        int answer = sum * 100 / max;
        int answer2 = sum / max * 100;
        System.out.println("answer = " + answer);
        System.out.println("answer2 = " + answer2);
    }
}
