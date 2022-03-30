package object;

public class TestStudent {
    public static void main(String[] args){
        Student s1 = new Student ("NgKhanh", 8.8);
        System.out.println("Name is: "+ s1.getName());
        System.out.println("GPA is: "+ s1.getGpa());

        Student s2 = new Student ("NgKhanh");
        System.out.println("Name is: "+ s2.getName());
        System.out.println("GPA is: "+ s2.getGpa());

        Student s3 = new Student ();
        System.out.println("Name is: "+ s3.getName());
        System.out.println("GPA is: "+ s3.getGpa());
    }
}
