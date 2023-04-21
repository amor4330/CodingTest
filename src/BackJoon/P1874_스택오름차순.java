package BackJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class P1874_스택오름차순 {
    public static void main(String[] args) throws Exception{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(bf.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.valueOf(bf.readLine());
        }

        int num = 1;
        StringBuffer answer = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        boolean result = true;

        for (int i = 0; i < N; i++) {
            int su = A[i];

            if(su >= num){
                while (su >= num) {
                    stack.push(num++);
                    answer.append("+\n");
                }
                stack.pop();
                answer.append("-\n");
            }
            else{
                int n = stack.pop();
                if (n > su) {
                    result = false;
                    System.out.println("NO");
                    break;
                }
                answer.append("-\n");
            }

        }
            if(result) System.out.println(answer);


//        Scanner scan = new Scanner(System.in);
//
//        int N = scan.nextInt();
//        int[] A = new int[N];
//        for (int i = 0; i < N; i++) {
//            A[i] = scan.nextInt();
//        }
//
//        Stack<Integer> stack = new Stack<>();
//        int num = 1;
//        boolean result = true;
//        StringBuffer bf = new StringBuffer();
//
//        for (int i = 0; i < N; i++) {
//            int su = A[i];
//
//            if(su >= num) {
//                while (su < num) {
//                    stack.push(num++);
//                    bf.append("+\n");
//                }
//                stack.pop();
//                bf.append("-\n");
//            }
//            else{
//                int n = stack.pop();
//                if(n > su) {
//                    System.out.println("NO");;
//                    result = false;
//                    break;
//                }else{
//                    bf.append("-\n");
//                }
//            }
//        }
//
//        if(result) System.out.println(bf.toString());
    }
}
