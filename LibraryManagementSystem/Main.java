public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("Java Basics", "John Doe"));
        library.addBook(new Book("Advanced Java", "Jane Smith"));

        // Add users
        library.addUser(new User("Alice", 1));
        library.addUser(new User("Bob", 2));

        // Show all books
        System.out.println("Books in Library:");
        library.showBooks();

        // Issue a book
        library.issueBook("Java Basics", 1);

        // Show all books after issuing
        library.showBooks();

        // Return a book
        library.returnBook("Java Basics");

        // Show all books after returning
        library.showBooks();
    }
}
