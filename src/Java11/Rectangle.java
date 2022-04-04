package Java11;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float l, float w){
        length = l;
        width = w;
    }

    public Rectangle(float l){
        length = l;
        width = 125;
    }

    public Rectangle(){
        length = 41;
        width = 125;
    }

    public float getLength(){
        return length;
    }

    void setLength(float length){
        this.length = length;
    }

    public float getWidth(){
        return width;
    }

    void setWidth(float width){
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*length*width;
    }

    public String toString(){
        return "Rectangle [length = " + getLength() + ", width = " + getWidth();
    }

        public static void main(String[] args) {
        Rectangle r1 = new Rectangle(25, 35);
            System.out.println("Length is: "+r1.getLength());
            System.out.println("The area is: "+r1.getArea());
            System.out.println("The Perimeter is: "+r1.getPerimeter());
            System.out.println("toString is: "+r1.toString());

            Rectangle r2 = new Rectangle(25);
            r2.setLength(26);
            System.out.println("Length is: "+r2.getLength());
            System.out.println("The area is: "+r1.getArea());
            System.out.println("The Perimeter is: "+r1.getPerimeter());
            System.out.println("toString is: "+r1.toString());

            Rectangle r3 = new Rectangle();
            r3.setLength(811);
            r3.setWidth(41);
            System.out.println("The area is: "+r3.getArea());
            System.out.println("The Perimeter is: "+r3.getPerimeter());
            System.out.println("toString is: "+r3.toString());
    }
}
