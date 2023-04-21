package BackJoon;

import java.util.Scanner;

public class p12891_DNA비밀번호_나의풀이 {

    // 시간초과로 실패하였음.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] spArr = scan.nextLine().split(" ");
        int s = Integer.parseInt(spArr[0]);
        int p = Integer.parseInt(spArr[1]);

        String dna = scan.nextLine();
        String[] min = scan.nextLine().split(" ");
        int[] minArr = new int[4];
        for (int i = 0; i < minArr.length; i++) {
            minArr[i] = Integer.parseInt(min[i]);
        }

        int i = 0;
        int j = p;
        int count = 0;

        while (j <= s) {
            String pw = dna.substring(i, j);
            boolean check = true;
            int[] tmp = new int[4];

            for (int k = 0; k < pw.length(); k++) {
                if(pw.charAt(k) == 'A') tmp[0]++;
                else if(pw.charAt(k) == 'C') tmp[1]++;
                else if(pw.charAt(k) == 'G') tmp[2]++;
                else if(pw.charAt(k) == 'T') tmp[3]++;
            }


            for (int k = 0; k < tmp.length; k++) {
                if(tmp[k] != minArr[k]) check = false;
            }

            if(check) count++;
            i++;
            j++;
        }

        System.out.println("count = " + count);

    }
}
