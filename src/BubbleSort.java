import java.util.Arrays;

public class BubbleSort {
        /*
        버블정렬
        [장점]
        1. 추가적인 메모리 소비가 작다.
        2. 구현이 매우 쉽다.
        3. 안정정렬이 가능하다.
        [단점]
        1. 다른 정렬 알고리즘에 비해 교환 과정이 많아 많은 시간을 소비한다.
        [시간 복잡도]
        O(n²)
         */

    public static void bubble(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int tmp = 0; //값 교환을 위한 변수 tmp 초기화
            for (int j = i + 1; j < arr.length; j++) { //arr[i]가 arr[j]보다 크면 값 교환
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 6, 2, 1, 7, 9};

        bubble(arr);

        System.out.println(Arrays.toString(arr));


    }
}
