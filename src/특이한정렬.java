import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 특이한정렬 {
    public static void main(String[] args) {
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;

        ArrayList<Integer> arrlist = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            arrlist.add(numlist[i] - n);
        }

        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 0; i <= 10000; i++) {
            int tmp1 = arrlist.indexOf(i);
            if(tmp1 >= 0) answerList.add(arrlist.get(tmp1) + n);

            int tmp2 = arrlist.indexOf(-i);
            if(tmp2 >= 0 && tmp1 != tmp2) answerList.add(arrlist.get(tmp2) + n);

        }

        int[] answer = new int[numlist.length];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        System.out.println("answerList = " + answerList);



    }
}
