package java16.ex3;/*Welcome to my show !

@author: NgKhanh
Date: 4/12/2022
Time: 10:36 AM

ProjectName: JavaBasic1*/

public class Student extends Person{
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int max_courses = 30;
    public Student(String name, String address){
        super(name, address);
        numCourses = 0;
        courses = new String[max_courses];
        grades = new int[max_courses];
    }

    public void addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades(){
        System.out.println(this);
        for (int i = 0;i<numCourses;i++){
            System.out.println(" "+courses[i]+":"+grades[i]);
        }
        System.out.println();
    }
    public double getAverageGrade(){
        int sum = 0;
        for (int i = 0;i<numCourses;i++){
            sum += grades[i];
        }
        return (double)sum/numCourses;
    }

    @Override
    public String toString(){
        return "Student{" + getName() +"("+ getAddress() +")";
    }
}
