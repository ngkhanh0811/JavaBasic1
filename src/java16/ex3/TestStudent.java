package java16.ex3;/*Welcome to my show !

@author: NgKhanh
Date: 4/12/2022
Time: 10:56 AM

ProjectName: JavaBasic1*/

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("NgKhanh", "HaNoi");
        s1.addCourseGrade("T2109M", 2);
        System.out.println(s1);
        System.out.println("Average of grades is: "+s1.getAverageGrade());
        s1.printGrades();
    }
}
