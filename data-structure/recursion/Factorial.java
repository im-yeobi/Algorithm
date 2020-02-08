package ch2_recursion;

/**
 * @author yeobi Created 2020-02-08
 * @description 재귀 - 팩토리얼
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(-1));
    }

    public static int factorial(int num) {
        if (num < 0) {  // 예외 처리
            System.out.println("유효하지 않은 값입니다.");
            return 0;
        }

        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }

}
