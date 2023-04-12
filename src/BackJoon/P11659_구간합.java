package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11659_구간합 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();       //데이터 개수
        int quest = scan.nextInt();     //질의 개수

        int[] arr = new int[num + 1];   //데이터 배열 생성

        //배열 값 입력
        for (int i = 1; i <= num; i++) {
            arr[i] = scan.nextInt();
        }

        //구간 합 배열 구하기
        int[] sumArr = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            sumArr[i] = sumArr[i - 1] + arr[i];
        }

        //구간 합 구하기
        for (int i = 0; i < quest; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(sumArr[b] - sumArr[a - 1]);
        }

    }
}
