package java8.javastudy.array;

/**
 * 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?
 */
public class ex5_2 {

    public static void main(String[] args){
    int [] [] arr = {
            {5, 5, 5, 5, 5},
            {10, 10, 10},
            {20, 20, 20, 20},
            {30, 30}
    };

        System.out.println(arr[3].length); // 2


    }
}
