package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11659_구간합 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("데이터 개수를 입력하세요");
        int num = scan.nextInt();
        System.out.println("질문을 몇 개 하시나요?");
        int quest = scan.nextInt();

        int[] arr = new int[num];
        System.out.println(num + "개의 자연수를 입력하세요");

        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        //구간 합 배열
        int[] pArr = new int[num];
        for (int i = 0; i < num; i++) {
            if(i == 0) pArr[i] = arr[i];
            else pArr[i] = pArr[i-1] + arr[i];
        }

        System.out.println("Arrays.toString(pArr) = " + Arrays.toString(pArr));

        //다시 질의문 받기
        for (int i = 0; i < quest; i++) {
            System.out.println("더하기를 할 구간을 지정하세요");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int answer = 0;
            if(a == 1) answer = pArr[b-1];
            else answer = pArr[b-1] - pArr[a-2];

            System.out.printf("%d와 %d의 구간 합은 다음과 같습니다.", a, b);
            System.out.println(answer);
        }



    }
}
