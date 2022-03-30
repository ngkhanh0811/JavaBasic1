package object;

public class SoccerPlayer{
    private String name;
    private int number;
    private float xLocation;
    private float yLocation;
    public SoccerPlayer(){
        name = "NgKhanh";
        number = 81;
        xLocation = 125;
        yLocation = 151;
    }
    public SoccerPlayer(String n, int nu, float x, float y){
        name = n;
        number = nu;
        xLocation = x;
        yLocation = y;
    }
    public SoccerPlayer(String n, int nu, float x){
        name = n;
        number = nu;
        xLocation = x;
        yLocation = 151;
    }
    public SoccerPlayer(String n, int nu){
        name = n;
        number = nu;
        xLocation = 125;
        yLocation = 151;
    }
    public SoccerPlayer(String n){
        name = n;
        number = 81;
        xLocation = 125;
        yLocation = 151;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
    public float getxLocation(){
        return xLocation;
    }
    public float getyLocation(){
        return yLocation;
    }
}
