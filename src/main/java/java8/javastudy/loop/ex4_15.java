package java8.javastudy.loop;

/**
 * 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽
 * 어도 앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한
 * 다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
 * [Hint] 나머지 연산자를 이용하시오.
 */
public class ex4_15 { // 잘 모르는 문제
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;

        int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

        while (tmp !=0){
            result = result * 10 + tmp % 10;
            tmp = tmp /10;

        }

        if(number == result){
            System.out.println(number + "는 회문수 입니다.");
        }
        else {
            System.out.println(number + "는 회문수가 아닙니다.");
        }

        }
    }

