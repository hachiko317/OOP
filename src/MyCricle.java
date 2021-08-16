public class MyCricle {
    private MyPoint center;
    private int radius = 1;

    public MyCricle() {
    }

    public MyCricle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCricle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        int[] arr = new int[2];
        arr[0] = center.getX();
        arr[1] = center.getY();
        return arr;
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    public String toString() {
        return "MyCricle [radius=" + radius + " ,center=(" + getCenterX() + "," + getCenterY() + "]";
    }

    public double getArea() {
        return (double) radius * radius * Math.PI;
    }

    public double getCircumference() {
        return (double) radius * 2 * Math.PI;
    }

    public double distance(MyCricle c1) {
        double xDiff = center.getX() - c1.getCenterX();
        double yDiff = center.getY() - c1.getCenterY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

}
