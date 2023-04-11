package BackJoon;

import java.util.*;

public class example {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        //2~N까지의 자연수를 담은 배열 생성 0,1은 소수가 아니기 때문에
        int[] arr = new int[N];
        for(int i = 1; i < N; i++){
            arr[i] = i;
        }

        //소수를 담을 ArrayList 생성, 몇 개가 나올지 모르므로 List로 생성함
        ArrayList<Integer> primeArr = new ArrayList<>();

        //반복문으로 2부터 해당 수까지 나누어 약수 존재 판별
        for(int i = 2; i <= N; i++){
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    check = false;
                    break;
                }
            }
            if(check) primeArr.add(i);
        }


        System.out.println("primeArr = " + primeArr);

//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//
//        //2부터 N까지 소수임을 판별하는 boolean 배열 생성
//        boolean[] isPrime = new boolean[N+1];
//        Arrays.fill(isPrime, true);
//        isPrime[0] = isPrime[1] = false; //0과 1은 소수가 아니다.
//
//        //소수를 집어넣을 List 생성
//        ArrayList<Integer> prime = new ArrayList<>();
//
//        for (int i = 2; i * i <= N; i++) {
//            if (isPrime[i]) {
//                for(int j = 2; i * j <= N; j++){
//                    isPrime[i * j] = false;
//                }
//            }
//        }
//
//        for (int i = 0; i < isPrime.length; i++) {
//            if (isPrime[i]) {
//                prime.add(i);
//            }
//        }
    }
}
