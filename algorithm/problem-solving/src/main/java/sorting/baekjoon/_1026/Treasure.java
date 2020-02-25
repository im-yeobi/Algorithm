package sorting.baekjoon._1026;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yeobi Created 2020-02-24
 * {@link {https://www.acmicpc.net/problem/1026}}
 *
 * 백준 1026번. 보물
 * 알고리즘 분류 - 정렬
 */
public class Treasure {

    public static void main(String[] args) {
        // 5
        // 1 1 1 6 0
        // 2 7 8 3 1
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arrA = new int[num];
        int[] arrB = new int[num];
        int s = 0;

        // 배열 A
        for (int i = 0; i < num; i++) {
            arrA[i] = scanner.nextInt();
        }

        // 배열 B
        for (int i = 0; i < num; i++) {
            arrB[i] = scanner.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);
        /* 내림차순 정렬
        Integer[] arr = Arrays.stream(arrB).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Comparator.reverseOrder());
         */

        for (int i = 0; i < num; i++) {
            s += arrA[i] * arrB[num - 1 - i];
        }

        System.out.println(s);
    }

}
