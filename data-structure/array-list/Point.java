package array_list;

/**
 * @author yeobi Created 2020-02-17
 */
public class Point {

    private int xPos;
    private int yPos;

    public Point() { }

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setPoint(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int compare(Point point) {
        if (xPos == point.getXPos() && yPos == point.getYPos()) {
            return 0;
        } else if (xPos == point.getXPos()) {
            return 1;
        } else if (yPos == point.getYPos()) {
            return 2;
        }

        return -1;
    }

    @Override
    public String toString() {
        return "[" + xPos + ", " + yPos + "]";
    }

}
