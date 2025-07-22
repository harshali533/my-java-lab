class Book {
    String title;
    String author;
    boolean available;

    Book(String t, String a) {
        title = t;
        author = a;
        available = true;
    }

    void show() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    void borrow() {
        if (available) {
            available = false;
            System.out.println("Borrowed: " + title);
        } else {
            System.out.println(title + " is already borrowed");
        }
    }
}

class Magazine extends Book {
    String month;

    Magazine(String t, String a, String m) {
        super(t, a);
        month = m;
    }

    void show() {
        super.show();
        System.out.println("Issue: " + month);
    }
}

public class LibMain {
    public static void main(String[] args) {
        Book b1 = new Book("Wings of Fire", "APJ Abdul Kalam");
        Magazine m1 = new Magazine("Forbes", "Editor", "June");
        Book b2 = new Book("Java Made Easy", "James Gosling");

        Book[] lib = { b1, m1, b2 };

        for (int i = 0; i < lib.length; i++) {
            lib[i].show();
            System.out.println("------");
        }

        System.out.println("Borrowing Java Made Easy...");
        b2.borrow();

        System.out.println("Trying to borrow again...");
        b2.borrow();
    }
}
