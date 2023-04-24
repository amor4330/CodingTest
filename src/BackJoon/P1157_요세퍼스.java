package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1157_요세퍼스 {
    /*
    문제
    요세푸스 문제는 다음과 같다.

    1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
    이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
    이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다.
    예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.

    N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)

    출력
    예제와 같이 요세푸스 순열을 출력한다.
     */

    public static void main(String[] args) throws IOException {

        /*
        큐를 이용해서
        K의 배수이면 pop만
        K 배수가 아니면 pop한걸 다시 offer
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());

        Queue<Integer> before = new LinkedList<>();
        Queue<Integer> after = new LinkedList<>();


        for (int i = 1; i <= N; i++) {
            before.offer(i);
        }

        int count = 1;
        while (!before.isEmpty()) {
            if(count % K == 0) {
                after.offer(before.poll());
            }
            else{
                before.offer(before.poll());
            }
            count++;
        }
        StringBuffer sb = new StringBuffer();
        sb.append("<");
        for (Integer i : after) {
            sb.append(i).append(", ");
        }
        sb.delete(sb.length()-2, sb.length()).append(">");
        System.out.println(sb.toString());
    }
}
