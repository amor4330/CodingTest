package Programmers;

public class 선분길이 {
    public static void main(String[] args) {
        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};

        int[] myArr = new int[200];

        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
                myArr[j]++;
            }
        }

        int answer = 0;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > 1) {
                answer++;
            }
        }

        System.out.println("answer = " + answer);

    }
}
