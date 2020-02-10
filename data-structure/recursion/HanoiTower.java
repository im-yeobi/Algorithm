package recursion;

/**
 * @author yeobi Created 2020-02-10
 * @description 재귀 - 하노이 타워
 */
public class HanoiTower {

    public static void main(String[] args) {
        hanoiTower(3, 'A', 'B', 'C');
    }

    private static void hanoiTower(int num, char from, char by, char to) {
        if (num == 1) {
            // 탈출 조건
            // 원반의 수 한 개인 경우
            System.out.println("원반 " + num + "을 " + from + "에서 " + to + "로 이동");
            return;
        }

        hanoiTower(num-1, from, to, by);
        System.out.println("원반 " + num + "을 " + from + "에서 " + to + "로 이동");
        hanoiTower(num-1, by, from, to);
    }

}
