package Day0007;
// Design a class Book with overloaded methods to display book details in different formats.

class Book {
    String author;
    int age;
    String title;

    
    Book(String author, int age, String title) {
        this.author = author;
        this.age = age;
        this.title = title;
    }

   
    void display() {
        System.out.println("Author: " + author);
        System.out.println("Age: " + age);
        System.out.println("Title: " + title);
    }

    
    void display(String author, int age, String title) {
        System.out.println("Author: " + author);
        System.out.println("Age: " + age);
        System.out.println("Title: " + title);
    }
}

public class P6_book_ {
    public static void main(String[] args) {
        
        Book b = new Book("Utkarsh", 21, "Cybersecurity");

        
        b.display();

        
        b.display("Ram", 23, "India");
        b.display("Sam", 25, "Bike");
    }
}
