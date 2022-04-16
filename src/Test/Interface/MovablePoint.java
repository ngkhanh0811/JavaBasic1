package Test.Interface;/*Welcome to my show !

@author: NgKhanh
Date: 4/16/2022
Time: 2:38 PM

ProjectName: JavaBasic1*/

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void moveUp(){
        y++;
    }

    public void moveDown(){
        y--;
    }

    public void moveLeft(){
        x--;
    }

    public void moveRight(){
        x++;
    }
}
