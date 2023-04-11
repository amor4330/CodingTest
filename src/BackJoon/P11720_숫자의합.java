package BackJoon;

import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자 입력");
        int input = scan.nextInt();

        String str = String.valueOf(input);
        char[] cArr = str.toCharArray();

        int answer = 0;

        for (int i = 0; i < cArr.length; i++) {
            answer += cArr[i] - '0';
        }

        System.out.println("answer = " + answer);
    }
}
