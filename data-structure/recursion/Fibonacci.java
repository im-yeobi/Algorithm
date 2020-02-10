package recursion;

/**
 * @author yeobi Created 2020-02-08
 * @description 재귀 - 피보나치 수열
 */
public class Fibonacci {

    public static void main(String[] args) {
        // TODO 피보나치 수열을 재귀적으로 구현해보기
        // 0 1 1 2 3 5 8 13 21 34 55 ...
        // f(n) = f(n-1) + f(n-2)

        System.out.println(fibonacci(5));   // 3
        System.out.println(fibonacci(10));  // 34
        System.out.println(fibonacci(20));  // 4181
        System.out.println(fibonacci(-10));

        System.out.println();

        for (int i = 1; i < 15; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int num) {
        if (num < 1) {  // 예외 처리
            System.out.println("유효하지 않은 값입니다.");
            return 0;
        }

        if (num == 1) {
            return 0;
        }

        if (num == 2) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

}
