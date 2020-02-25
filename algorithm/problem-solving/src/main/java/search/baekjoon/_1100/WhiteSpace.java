package search.baekjoon._1100;

import java.util.Scanner;

/**
 * @author yeobi Created 2020-02-25
 * {@link {https://www.acmicpc.net/problem/1100}}
 *
 * 백준 1100번. 하얀 칸
 * 알고리즘 분류 - 탐색
 */
public class WhiteSpace {

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
            }
        }

        for (int i = 0; i < SIZE; i++) {
            if (i % 2 == 0) {
                // 짝수행
                // 0, 2, 4, 6
                num += check(chessBoard, i, 0);
                num += check(chessBoard, i, 2);
                num += check(chessBoard, i, 4);
                num += check(chessBoard, i, 6);
            } else {
                // 홀수행
                // 1, 3, 5, 7
                num += check(chessBoard, i, 1);
                num += check(chessBoard, i, 3);
                num += check(chessBoard, i, 5);
                num += check(chessBoard, i, 7);
            }
        }

        System.out.println(num);
    }

    public static int check(char[][] chessBoard, int row, int col) {
        if (chessBoard[row][col] == 'F')
            return 1;
        return 0;
    }

}
