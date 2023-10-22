package Core_Java.Association;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private Person librarian;
    private Book book;

    public Library(Person librarian, Book book) {
        this.librarian = librarian;
        this.book = book;
    }

    public void displayInfo() {
        System.out.println("Librarian: " + librarian.getName());
        System.out.println("Book Title: " + book.getTitle());
    }
}

public class Program {
    public static void main(String[] args) {
        Person librarian = new Person("Alice");
        Book book = new Book("Java Programming 101");

        Library library = new Library(librarian, book);
        library.displayInfo();
    }
}
