package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class P1406_에디터 {

    public static void main(String[] args) throws IOException {

        /*
        L: A pop B push
        D: B pop A push
        B: A pop
        P: A push
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());
        Stack<Character> sa = new Stack<>();
        Stack<Character> sb = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            sa.push(str.charAt(i));
        }

        for (int i = 0; i < M; i++) {
            char[] arr = br.readLine().toCharArray();
            switch (arr[0]) {
                case 'L' :
                    if(!sa.isEmpty()) {
                        char tmp = sa.pop();
                        sb.push(tmp);
                    }
                    break;
                case 'D':
                    if (!sb.isEmpty()) {
                        char tmp = sb.pop();
                        sa.push(tmp);
                    }
                    break;
                case 'B':
                    if(!sa.isEmpty()){
                        sa.pop();
                    }
                    break;
                case 'P':
                    sa.push(arr[2]);
                    break;
            }
        }

        int tmp = sb.size();

        for (int i = 0; i < tmp; i++) {
            sa.push(sb.pop());
        }

        StringBuffer answer = new StringBuffer();

        for (Character character : sa) {
            answer.append(character);
        }
        System.out.println(answer);

    }
}
