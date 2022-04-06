package Java14.ex1;

public class TestAuthor {
    public static void main(String[] args) {
        Author NgKhanh = new Author("Nguyen Khanh", "nguyenkhanh08112003@gmail.com", 'M');
        System.out.println(NgKhanh);
        NgKhanh.setEmail("nguyenkhanh08112003@gmail.com");
        System.out.println("Name is: "+NgKhanh.getName());
        System.out.println("Email is: "+NgKhanh.getEmail());
        System.out.println("Gender is: "+NgKhanh.getGender());
    }
}
