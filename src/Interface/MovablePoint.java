package Interface;/*Welcome to my show !

@author: NgKhanh
Date: 4/15/2022
Time: 11:00 PM

ProjectName: JavaBasic1*/

public class MovablePoint implements Movable{
    private int x;
    private int y;
    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void moveLeft() {
        x--;
    }
}
