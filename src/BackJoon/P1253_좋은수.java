package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1253_좋은수 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        String[] str = scan.nextLine().split(" ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);

        /*
        첫 번째는 무시해야해
        가장 마지막 숫자부터 num = arr.length-1

        반복문
        포인터를 i = 0; j = num-1로 지정
        arr[i] + arr[j] > arr[num] j--;
        arr[i] + arr[j] < arr[num] i++;
        arr[i] + arr[j] == arr[num] count++; i = 0; num--; j = num-1;
        이건가?
        num이 0이면 두 수의 합이 존재하지 않으므로 패스
         */

        int num = N-1;
        int count = 0;
        int i = 0;
        int j = num -1;

        while (num > 1) {
            int sum = Math.abs(arr[i] + arr[j]);
            int check = Math.abs(arr[num]);

            if(sum > check) j--;
            else if(sum < check) i++;
            else if(sum == check){
                count++;
                num--;
                i = 0;
                j = num-1;
            }
            if(i == j){
                num--;
                i = 0;
                j = num-1;
            }
        }

        System.out.println(count);
    }
}
