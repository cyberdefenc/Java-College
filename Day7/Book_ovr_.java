// P7. Design a class Book with overloaded methods to display book details in different formats.
class Book {
    void display(String title, String author) {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    void display(String title, String author, double price) {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

class Book_ovr_ {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.display("Java Basics", "Utkarsh Kushwaha");
        obj.display("Advanced Java", "Utkarsh Kushwaha", 499.99);
    }
}