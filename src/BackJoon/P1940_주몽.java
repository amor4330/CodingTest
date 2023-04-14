package BackJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1940_주몽 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());  //재료 개수
        int M = Integer.parseInt(scan.nextLine());  //합
        String str = scan.nextLine();

        String[] strArr = str.split(" ");

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(strArr[i]));
        }

        Collections.sort(list);
        int i = 0;
        int j = N-1;
        int count = 0;

        while (i < j) {
            int sum = list.get(i) + list.get(j);

            if(sum > M) j--;
            else if(sum < M) i++;
            else {
                count++;
                i++;
                j--;
            }
        }

//        int start_index = 0;
//        int end_index = 1;
//        int count = 0;
//
//        while (start_index != N -1) {
//            int sum = list.get(start_index) + list.get(end_index);
//
//            if(sum == M) {
//                count++;
//                start_index++;
//                end_index = start_index + 1;
//            }else if(end_index == N-1){
//                start_index++;
//                end_index = start_index + 1;
//            }else{
//                end_index++;
//            }
//        }

        System.out.println("count = " + count);

    }
}
