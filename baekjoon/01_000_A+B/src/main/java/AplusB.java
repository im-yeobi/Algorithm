import java.util.Scanner;

/**
 * @author yeobi Created 2020-01-10
 * {@link {https://www.acmicpc.net/problem/1000}}
 *
 * 백준 1000번, A+B
 * 클래스 이름을 Main으로 해야 런타임 오류가 안 난다.
 */
public class AplusB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        System.out.println(add(firstNum, secondNum));
    }

    private static int add(int firstNum, int secondNum) {
        // 예외 처리를 잘하자 !
        if (firstNum <= 0) {
            // firstNum 범위 오류
            return 0;
        }

        if (secondNum >= 10) {
            // secondNum 범위 오류
            return 0;
        }
        return firstNum + secondNum;
    }

}
