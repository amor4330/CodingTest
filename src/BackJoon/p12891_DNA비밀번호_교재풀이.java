package BackJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p12891_DNA비밀번호_교재풀이 {
    static int[] myArr;   //슬라이딩윈도우 문자
    static int[] checkArr;//비밀번호 조건
    static int checkPw;            //4개 문자 중에서 조건을 만족하는 문자의 개수

    public static void main(String[] args) throws Exception{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;
        myArr = new int[4];
        checkArr = new int[4];
        checkPw = 0;


        char[] A = bf.readLine().toCharArray(); //문자열
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) checkPw++;     // 필요한 개수가 0이라는 것은 없어도 상관없다라는 것이므로
        }

        for (int i = 0; i < P; i++) {
            add(A[i]);
        }

        if(checkPw == 4) result++;

        for (int i = P; i < S; i++) {
            int j = i - P;
            add(A[i]);
            remove(A[j]);

            if(checkPw == 4) result++;
        }

        System.out.println("result = " + result);
    }

    private static void add(char c) {
        switch (c){
            case 'A' :
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkPw++;
                break;
            case 'C' :
                myArr[1]++;
                if(myArr[1] == checkArr[2]) checkPw++;
                break;
            case 'G' :
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkPw++;
                break;
            case 'T' :
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkPw++;
                break;
        }
    }

    private static void remove(char c) {
        switch (c){
            case 'A' :
                if(myArr[0] == checkArr[0]) checkPw--;
                myArr[0]--;
                break;
            case 'C' :
                if(myArr[1] == checkArr[2]) checkPw--;
                myArr[1]--;
                break;
            case 'G' :
                if(myArr[2] == checkArr[2]) checkPw--;
                myArr[2]--;
                break;
            case 'T' :
                if(myArr[3] == checkArr[3]) checkPw--;
                myArr[3]--;
                break;
        }
    }
}
