package activities;

// Abstract class
abstract class Book {
    String title;

    // Abstract method (no body here)
    abstract void setTitle(String s);

    // Concrete method
    String getTitle() {
        return title;
    }
}
