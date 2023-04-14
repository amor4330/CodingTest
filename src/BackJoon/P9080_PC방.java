package BackJoon;

import java.util.Scanner;

public class P9080_PC방 {
    public static void main(String[] args) {

        /*

        문제 잘못 이해함 다시;
        HH: 시작 시
        MM: 시작 분
        D: 플레이 시간

        D / 60 = 플레이 시 ph
        D % 60 = 플레이 분 pd

        m = MM + pd
        m > 60 ? m % 60 : m

        h = HH + ph
        h + m >= 24 ? h % 24 : h + m;
         */

        Scanner scan = new Scanner(System.in);
        int test = Integer.parseInt(scan.nextLine()); // 테스트 횟수
        String str = scan.nextLine();                 // HH:MM D

        for (int i = 0; i < test; i++) {
            int a = str.indexOf(':');
            int b = str.indexOf(' ');

            int hh = Integer.parseInt(str.substring(0, a));
            int mm = Integer.parseInt(str.substring(a+1, b));
            int d = Integer.parseInt(str.substring(b+1));

            int ph = d / 60;
            int pd = d % 60;

            int m = mm + pd;
            m = m >= 60 ? m % 60 : m;

            int h = hh + ph + (m/60);
            h = h >= 24 ? h % 24 : h;
            h = m > 0 ? h + 1 : h;
        }

    }
}
