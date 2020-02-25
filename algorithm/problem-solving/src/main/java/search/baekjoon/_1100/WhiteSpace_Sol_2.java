package search.baekjoon._1100;

import java.util.Scanner;

/**
 * @author yeobi Created 2020-02-25
 * 다른 사람 풀이방법 참조 2
 * 가장 좋은 방법이라고 생각한다.
 * 하얀 칸의 규칙을 찾아서 간단하게 해결 가능.
 * 알고리즘 풀 때 규칙을 찾기 위해 노력해야 한다. (단순한 방법 지양)
 */
public class WhiteSpace_Sol_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 8;
        // 체스판
        char[][] chessBoard = new char[SIZE][SIZE];
        // 하얀 칸 위의 말 개수
        int num = 0;

        String str = "";
        for (int i = 0; i < SIZE; i++) {
            str = scanner.nextLine();
            for (int j = 0; j < SIZE; j++) {
                chessBoard[i][j] = str.charAt(j);

                // (i + j)를 2로 나눈 나머지가 0인 경우 => 하얀 칸이다.
                if ((i + j) % 2 == 0 && chessBoard[i][j] == 'F') {
                    num++;
                }
            }
        }

        System.out.println(num);
    }

}
