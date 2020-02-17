package array_list;

/**
 * @author yeobi Created 2020-02-17
 * @description Array List 구현하기
 */
public class ArrayMain {

    public static void main(String[] args) {
        Point point = new Point();
        Array arrayList = new Array();
        arrayList.init();

        arrayList.insert(new Point(0, 1));
        arrayList.insert(new Point(2, 5));
        arrayList.insert(new Point(2, 4));
        arrayList.insert(new Point(7, 6));
        arrayList.insert(new Point(1, 24));

        System.out.println();

        System.out.println("리스트 조회");
        if (arrayList.first(point)) {
            System.out.println(point);

            while (arrayList.next(point)) {
                System.out.println(point);
            }
        }
        System.out.println();

        System.out.println("xPos 2인 데이터 삭제");
        Point comparePoint = new Point(2, 0);
        if (arrayList.first(point)) {
            if (point.compare(comparePoint) == 1) {
                // x만 일치
                System.out.println(arrayList.remove());
            }

            while (arrayList.next(point)) {
                if (point.compare(comparePoint) == 1) {
                    // x만 일치
                    System.out.println(arrayList.remove());
                }
            }
        }
        System.out.println();

        System.out.println("삭제 후 리스트 조회");
        if (arrayList.first(point)) {
            System.out.println(point);

            while (arrayList.next(point)) {
                System.out.println(point);
            }
        }
        System.out.println();
    }

}
