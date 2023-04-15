package BackJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1940_주몽2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        int M = Integer.parseInt(scan.nextLine());
        String str = scan.nextLine();
        String[] sarr = str.split(" ");

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(sarr[i]);
        }

        Arrays.sort(arr);

        int count = 0;
        int i = 0;
        int j = N-1;
        while(i < j){
            int sum = arr[i] + arr[j];

            if(sum < M) i++;
            else if(sum > M) j--;
            else {
                count++;
                i++;
                j--;
            }
        }

        System.out.println("count = " + count);
        System.out.println(count);
    }
}
