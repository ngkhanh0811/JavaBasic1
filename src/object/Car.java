package object;

public class Car {
    private int plateNumber;
    private float xLocation;
    private float yLocation;
    private double speed;
    public Car(){
        plateNumber = 81;
        xLocation = 41;
        yLocation = 811;
        speed = 100;
    }
    public Car(int p, float x, float y, double s){
        plateNumber = p;
        xLocation = x;
        yLocation = y;
        speed = s;
    }
    public Car(int p, float x, float y){
        plateNumber = p;
        xLocation = x;
        yLocation = y;
        speed = 100;
    }
    public Car(int p, float x){
        plateNumber = p;
        xLocation = x;
        yLocation = 811;
        speed = 100;
    }
    public Car(int p){
        plateNumber = p;
        xLocation = 41;
        yLocation = 811;
        speed = 100;
    }
    public int getPlateNumber(){
        return plateNumber;
    }
    public float getyLocation(){
        return yLocation;
    }
    public float getxLocation(){
        return xLocation;
    }
    public double getSpeed(){
        return speed;
    }
}
