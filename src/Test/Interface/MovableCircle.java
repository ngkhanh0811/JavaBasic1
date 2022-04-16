package Test.Interface;/*Welcome to my show !

@author: NgKhanh
Date: 4/16/2022
Time: 2:41 PM

ProjectName: JavaBasic1*/

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed){
        this.radius = radius;
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    public MovablePoint getCenter(){
        return center;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveUp(){
        center.y++;
    }

    public void moveDown(){
        center.y--;
    }

    public void moveLeft(){
        center.x--;
    }

    public void moveRight(){
        center.x++;
    }
}
