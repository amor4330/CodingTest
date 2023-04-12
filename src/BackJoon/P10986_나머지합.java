package BackJoon;

import java.util.Scanner;

public class P10986_나머지합 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 배열 개수
        int M = scan.nextInt(); // 나눌 수

        //합 배열
        int[] sum = new int[N + 1];

        //합 배열 초기화하면서 M으로 나눈 나머지 구하기
        for(int i = 1; i <= N; i++){
            sum[i] = (sum[i-1] + scan.nextInt()) % M;
        }

        int answer = 0; // M으로 나누어 떨어지는 구간의 합 개수
        for (int i = 1; i < M; i++) {
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if(sum[j] == 0) answer++;   //나머지가 0 : 0 ~ j까지의 구간이므로 그냥 카운트
                else{
                    if(sum[j] == i){        //나머지가 같은 것들을 셈
                        count++;
                    }
                }
            }
            if(count > 1) {
                //나머지가 같을 때 빼면 M으로 나누어 떨어짐
                //n개에서 2개 뽑는 방법 = n! / (n-2)! * 2! = n * (n-1) / 2
                answer += count * (count-1) / 2;
            }
        }

    }
}
