package search.baekjoon._1145;

import java.util.Scanner;

/**
 * @author yeobi Created 2020-02-26
 * {@link {https://www.acmicpc.net/problem/1145}}
 * <p>
 * 백준 1145번. 적어도 대부분의 배수
 * 알고리즘 분류 - 탐색 (완전 탐색)
 * 정답 비율 - 61.064 %
 */
public class LeastMultiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SIZE = 5;
        // 5개의 자연수
        int[] arr = new int[SIZE];
        int min = 100;

        // 자연수 입력. 100보다 작거나 같은 서로 다른 자연수
        for (int i = 0; i < SIZE; i++) {
            arr[i] = sc.nextInt();

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int cnt = 0;
        while (true) {  // 나올 수 있는 가장 큰 값은 실질적으로 100 * 99 * 98 = 970,200
            for (int i = 0; i < SIZE; i++) {
                if (min % arr[i] == 0) cnt++;
            }

            // 적어도 세 개의 자연수로 나누어지는 경우 반복문 탈출
            if (cnt >= 3) break;

            cnt = 0;
            min++;
        }

        System.out.println(min);
    }

}
