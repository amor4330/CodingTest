package BackJoon;

import java.util.*;

public class example {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       int N = scan.nextInt();

       //2부터 N까지 소수임을 판별하는 boolean 배열 생성
       boolean[] isPrime = new boolean[N+1];
       Arrays.fill(isPrime, true);
       isPrime[0] = isPrime[1] = false; //0과 1은 소수가 아니다.

       //소수를 집어넣을 List 생성
       ArrayList<Integer> prime = new ArrayList<>();

       for (int i = 2; i * i <= N; i++) {
           if (isPrime[i]) {
               for(int j = 2; i * j <= N; j++){
                   isPrime[i * j] = false;
               }
           }
       }

       for (int i = 0; i < isPrime.length; i++) {
           if (isPrime[i]) {
               prime.add(i);
           }
       }
    }
}
