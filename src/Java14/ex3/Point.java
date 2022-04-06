package Java14.ex3;
import java.lang.Math;

public class Point {
    private int x;
    private int y;

    public Point(){
        x=0;
        y=0;
    }

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    void setX(int x){
        this.x=x;
    }

    public int getY(){
        return y;
    }

    void setY(int y){
        this.y=y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public int[] getXY() {
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public double distance(Point another){
        return Math.sqrt(((another.x)-x)*((another.x)-x) + ((another.y)-y)*((another.y)-y));
    }
}
