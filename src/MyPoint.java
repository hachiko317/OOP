public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        int x =0;
        int y =0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] arr = new int[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        double xDiff = this.x - x;
        double yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(MyPoint p) {
        double xDiff = this.x - p.getX();
        double yDiff = this.y - p.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double distance(){
        double xDiff = this.x - 0;
        double yDiff = this.y - 0;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
