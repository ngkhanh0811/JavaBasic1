package Java14.ex3;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(3,4);
        Point p2 = new Point(6,7);
        Point p3 = new Point();
        p1.setX(10);
        p1.setX(12);
        p2.setXY(6,7);
        System.out.println("Distance of given point with another point is: "+p1.distance(p2));
        System.out.println();
        System.out.println("Distance from this to (0,0) is: "+p1.distance(p3));
    }
}
