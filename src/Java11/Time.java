package Java11;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    void setHour(int hour){
        this.hour = hour;
    }

    void setMinute(int minute){
        this.minute=minute;
    }

    void setSecond(int second){
        this.second=second;
    }

    void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public String toString(){
        return "hh:mm:ss is: " + getHour() +":" + getMinute() + ":"+ getSecond();
    }

    public static void main(String[] args) {
        Time t1 = new Time(01, 30, 41);
        System.out.println(t1.toString());
    }
}
