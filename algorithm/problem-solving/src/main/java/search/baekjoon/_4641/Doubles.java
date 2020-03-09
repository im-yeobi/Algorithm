package search.baekjoon._4641;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yeobi Created 2020-03-09
 * @link 'https://www.acmicpc.net/problem/4641'
 * <p>
 * 백준 4641번. Doubles
 * 알고리즘 분류 - 브루트 포스, 완전 탐색
 * 정답 비율 - 69.726 %
 */
public class Doubles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num;
        int cnt = 0;

        while (true) {
            num = sc.nextInt();

            if (num == -1) break;
            if (num == 0) {
                for (int i = 0; i < list.size(); i++) {
                    for (int j = 0; j < list.size(); j++) {
                        if (i != j && list.get(i) * 2 == list.get(j)) cnt++;
                    }
                }
                System.out.println(cnt);

                list.clear();
                cnt = 0;
            } else {
                list.add(num);
            }
        }
    }

}
