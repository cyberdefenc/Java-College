//  Single-Level Inheritance - Book Example
//Create a class Book with method read().
//Create a class Novel that inherits from Book and adds method storyLine().
//Create an object of Novel and call both methods.

package Day5;

class Book {
    void read() {
        System.out.println("Reading a book...");
    }
}

class Novel extends Book {
    void storyLine() {
        System.out.println("The novel has a thrilling storyline with unexpected twists!");
    }
}

public class P5_s_book_ {
    public static void main(String[] args) {
        Novel n = new Novel();
        n.read();
        n.storyLine();
    }
}
