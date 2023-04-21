package BackJoon;

import org.w3c.dom.Node;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P11003_최솟값찾기 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String str2 = scan.nextLine();

        String[] arr = str.split(" ");
        String[] arr2 = str.split(" ");

        int N = Integer.parseInt(arr[0]);
        int L = Integer.parseInt(arr[1]);
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(arr2[i]);
        }


        Deque<Node> myque = new LinkedList<>();

        int index = 0;

        while(index != L){
            if(index - (L-1) >= 0) {
//                if(myque.)
            }

        }

    }

    class Node{
        int value;
        int index;

        public void Node(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
}
