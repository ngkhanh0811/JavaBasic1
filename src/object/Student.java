package object;

public class Student {
    private String name;
    private double gpa;
    public Student(){
        name = "Paul Lee";
        gpa = 3.5;
    }
    public Student(String n, double g){
        name = n;
        gpa = g;
    }
    public Student(String n){
        name = n;
        gpa = 8.0;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
}
