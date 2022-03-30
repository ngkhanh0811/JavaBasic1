package pdf;
import java.util.Scanner;

public class Student {
    String studName;
    int studAge;

    void initialize(){
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<4;i++) {
            studAge = scanner.nextInt();
            studName = scanner.nextLine();
        }
    }

    void display(){
        System.out.println("Student Name: " + studName);
        System.out.println("Student Age: " + studAge);
    }

    public static void main(String[] args){
        Student objStudent = new Student();
        objStudent.initialize();
        objStudent.display();
    }
}
