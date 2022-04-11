package Java14.test;

import java.util.Date;

public class Student {
    private int rollNo;
    private String name;
    private Date dob;
    private int status;
    private ClassStuff ClassCurrent;

    public Student(int rollNo, String name, Date dob, int status, ClassStuff Class){
        this.rollNo=rollNo;
        this.name=name;
        this.dob=dob;
        this.ClassCurrent=Class;
        this.status=status;
    }

    public int getRollNo(){
        return rollNo;
    }

    void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }

    public String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    public Date getDob(){
        return dob;
    }

    void setDob(Date dob){
        this.dob=dob;
    }

    public ClassStuff getClassCurrent(){
        return ClassCurrent;
    }

    public void setClassCurrent(ClassStuff classCurrent) {
        ClassCurrent = classCurrent;
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String toString(){
        return "rollNo is: "+rollNo+", Name is: "+name+", Date of birth is: "+dob+", Class Current["+ClassCurrent+"]";
    }
}
