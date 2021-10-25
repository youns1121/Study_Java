package java8.javastudy.objectoriented;

/**
 * 메서드명 : abs
 * 기 능 주어진 값의 절대값을 반환한다 : .
 * 반환타입 : int
 * 매개변수 : int value
 */
public class Ex6_24 {


    //(1)abs메서드를 작성하시오

    private static int abs(int value){

//        return Math.abs(value);  // Math.abs 메서드 이용

        if(value < 0){
            return -value;
        }else return value;
    }


    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));
    }
}
