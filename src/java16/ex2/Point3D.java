package java16.ex2;/*Welcome to my show !

@author: NgKhanh
Date: 4/10/2022
Time: 9:19 PM

ProjectName: JavaBasic1*/

public class Point3D extends Point2D {
    private int z;
    public Point3D(){
        super();
        this.z=0;
    }

    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public int getZ(){
        return z;
    }

    public void setZ(int z){
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
