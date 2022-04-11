package Java14.test;

import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        Date d1 = new Date(8, 11, 2003);
        ClassStuff cs1 = new ClassStuff(1, "T2109M");
        Student s1 = new Student(12,"Khanh", d1,1, cs1);
        System.out.println(s1);
        s1.setName("NgKhanh");
        s1.setDob(d1);
        s1.setRollNo(1);
        s1.setStatus(1);
        System.out.println("Name of student is: "+s1.getName());
        System.out.println("Class of student is: "+s1.getClassCurrent());
        System.out.println("Class name of student is: "+cs1.getClassName());
        System.out.println("Id of student is:"+cs1.getClassId());
        System.out.println("DOB of student is: "+s1.getDob());
        System.out.println("Learning status is: "+s1.getStatus());
        System.out.println("Roll No of students is: "+s1.getRollNo());
    }
}
