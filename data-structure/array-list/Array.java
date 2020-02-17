package array_list;

/**
 * @author yeobi Created 2020-02-17
 */
public class Array {

    private final int MAX_LENGTH = 10;

    private Point[] arr;
    private int numOfData;
    private int curPosition;

    public void init() {
        System.out.println("리스트 초기화");
        arr = new Point[MAX_LENGTH];
        numOfData = 0;
        curPosition = -1;
    }

    public void insert(Point point) {
        System.out.println("리스트 요소 추가");
        if (numOfData >= MAX_LENGTH) {
            System.out.println("리스트 크기 " + MAX_LENGTH + " 초과");
            return;
        }

        arr[numOfData] = point;
        numOfData++;
    }

    public boolean first(Point point) {
        System.out.println("리스트 첫 번째 요소 가리킴");
        if (numOfData == 0) {
            return false;
        }

        curPosition = 0;
        Point el = arr[curPosition];
        point.setPoint(el.getXPos(), el.getYPos());
        return true;
    }

    public boolean next(Point point) {
        System.out.println("리스트 다음 요소 가리킴");
        if (curPosition + 1 >= numOfData) {
            return false;
        }

        curPosition++;
        Point el = arr[curPosition];
        point.setPoint(el.getXPos(), el.getYPos());
        return true;
    }

    public Point remove() {
        System.out.println("리스트 요소 삭제");
        Point removeEl = arr[curPosition];
        for (int i = curPosition; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        numOfData--;
        curPosition--;

        return removeEl;
    }

    public int count() {
        return arr.length;
    }

}
