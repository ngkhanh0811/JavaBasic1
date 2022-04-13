package java16.ex3;/*Welcome to my show !

@author: NgKhanh
Date: 4/12/2022
Time: 11:01 AM

ProjectName: JavaBasic1*/

public class Teacher extends Person {
    private int numCourse;
    private String[] courses;
    private static final int max_courses = 100;
    public Teacher(String name, String address){
        super(name, address);
        numCourse = 0;
        courses = new String[max_courses];
    }

    public boolean addCourse(String course){
        for (int i =0;i<numCourse; i++){
            if (courses[i].equals(courses)) return false;
        }
        courses[numCourse] = course;
        numCourse++;
        return true;
    }

    public boolean removeCourse(String course){
        boolean found = false;
        int courseIndex = -1;
        for(int i = 0;i<numCourse;i++){
            if(courses[i].equals(course)){
                courseIndex = i;
                found = true;
                break;
            }
        }
        if(found){
            for (int i = courseIndex;i<numCourse-1;i++){
                courses[i] = courses[i+1];
            }
            numCourse --;
            return true;
        } else {
            return false;
        }
    }
}
