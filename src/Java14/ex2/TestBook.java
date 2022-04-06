package Java14.ex2;

import Java14.ex1.Author;

public class TestBook {
    public static void main(String[] args) {
        Author NgKhanh = new Author("Nguyen Khanh", "nguyenkhanh08112003@gmail.com", 'M');
        System.out.println(NgKhanh);

        Book dummyBook = new Book("Java for dummies", 100, 10, NgKhanh);
        System.out.println(dummyBook);
        dummyBook.setPrice(200);
        dummyBook.setQty(99);

        System.out.println("Name is: "+dummyBook.getName());
        System.out.println("Price is: "+dummyBook.getPrice());
        System.out.println("Quantity is: "+dummyBook.getQty());
        System.out.println("Author is: "+dummyBook.getAuthor());
        System.out.println("Author name is: "+NgKhanh.getName());
        System.out.println("Author gender is: "+NgKhanh.getGender());
        System.out.println("Author email is: "+NgKhanh.getEmail());

        Book moreDummyBook = new Book("Java for more dummies", 200, 9999, new Author("Quang Anh", "dinhquanganh1234@gmail.com", 'F'));
        System.out.println(moreDummyBook);
    }
}
