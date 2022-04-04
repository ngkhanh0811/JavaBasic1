package Java11;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    void setDay(int day){
        this.day=day;
    }

    void setMonth(int month){
        this.month=month;
    }

    void setYear(int year){
        this.year=year;
    }

    void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return "Date of dd/mm/yyyy is: " + getDay() + "/" + getMonth() + "/" + getYear();
    }

    public static void main(String[] args){
        Date d1 = new Date(8, 11, 2003);
        System.out.println(d1.toString());
    }
}
