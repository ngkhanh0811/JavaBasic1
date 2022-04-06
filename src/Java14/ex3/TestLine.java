package Java14.ex3;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(1,2,3,4);
        Line l2 = new Line(4,5,6,7);
        System.out.println(l1);
        System.out.println(l2);

        l1.setBegin(new Point(1,2));
        System.out.println("l1 begin is: "+l1.getBegin());
        l1.setEnd(new Point(5,6));
        System.out.println("l1 end is: "+l1.getEnd());
        System.out.println("Line is: "+l1);

        l1.setBeginX(1);
        l1.setBeginY(2);
        l1.setEndX(5);
        l1.setEndY(7);
        System.out.println(l1);
        System.out.println("Length of line 1 is: " + l1.getLength());
    }
}
