package BackJoon;
import java.util.*;

public class P11660_구간합2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); // 배열 개수
        int b = scan.nextInt(); // 질의 개수

        int[][] arr = new int[a+1][a+1]; //a x a 이중배열 생성

//        for (int i = 1; i <= a; i++) {
//            for (int j = 1; j <= a; j++) {
//                arr[i][j] = scan.nextInt();
//            }
//        }
//
//        int[][] sumArr = new int[a+1][a+1]; // 합 배열
//
//        for (int i = 1; i <= a; i++) {
//            for (int j = 1; j <= a; j++) {
//                sumArr[i][j] = sumArr[i][j - 1] + sumArr[i - 1][j] - sumArr[i - 1][j - 1] + arr[i][j]);
//            }
//        }
//
        int[][] sumArr = new int[a+1][a+1]; // 합 배열

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                sumArr[i][j] = sumArr[i][j - 1] + sumArr[i - 1][j] - sumArr[i - 1][j - 1] + (scan.nextInt());
            }
        }

        //구간 합 배열 질의 답변
        for (int i = 0; i < b; i++) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            int result = sumArr[x2][y2] - sumArr[x1 - 1][y2] - sumArr[x2][y1 - 1] + sumArr[x1 - 1][y1 - 1];
            System.out.println("result = " + result);
        }




    }
}
