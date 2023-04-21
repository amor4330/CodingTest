package BackJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17298_오큰수 {
    public static void main(String[] args) throws Exception{

        /*
        내가 배워야할 점
        1. 스택을 활용하는데 값이 아닌 인덱스를 넣었다.
         */

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.valueOf(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] answer = new int[N];

        for (int i = 1; i < N; i++) {

            if (A[stack.peek()] < A[i]) {
                while(!stack.isEmpty() && A[stack.peek()] < A[i]){
                    int tmp = stack.pop();
                    answer[tmp] = A[i];
                }
                stack.push(i);
            }else{
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));



    }
}
