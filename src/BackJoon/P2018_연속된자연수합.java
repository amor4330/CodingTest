package BackJoon;

import java.util.Scanner;

public class P2018_연속된자연수합 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int count = 1; //경우의 수인데 num 혼자 있을 경우를 미리 카운트한다.

        //시간 초과 ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
//        int[] arr = new int[num + 1];       //합배열 생성
//
//        for (int i = 1; i <= num; i++) {    //합배열 초기화
//            arr[i] = arr[i - 1] + i;
//        }
//
//        // num의 절반을 넘어선 자연수의 합은 무조건 num 보다 크기 때문에 num/2 까지만 계산
//        for (int i = 1; i <= Math.round((float)num/2); i++) {
//            for (int j = 0; j < i; j++) {
//                //합배열의 차이가 num과 같으면 count증가, 반복 중지
//                if(arr[i] - arr[j] == num) {
//                    count++;
//                    break;
//                };
//            }
//        }

        /*
        투 포인터 알고리즘 적용
        1) sum > N
        sum - start_index;    start_index++;
        2) sum < N
        end_index++;          sum = sum + end_index;
        3) sum == N
        end_index++;          sum = sum + end_index;   count++;
         */

        int si = 1; // start_index
        int ei = 1; // end_index
        int sum = 1;

        while (si != num) {
            if(sum < num) {
                sum += ei;
                ei++;
            } else if (sum > num) {
                sum -= si;
                si++;
            }else{
                count++;
                ei++;
                sum += ei;
            }
        }

        System.out.println("count = " + count);


    }
}
