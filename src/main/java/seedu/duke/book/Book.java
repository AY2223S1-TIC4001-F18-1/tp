package seedu.duke.book;

public class Book {
    protected String title;
    protected String author;
    protected String edition;
    protected String published;
    protected String category;
    protected boolean onShelf;
    protected String borrower;

    public Book(String title, String author, String edition,
                String published, String category, boolean onShelf, String borrower) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.published = published;
        this.category = category;
        this.onShelf = onShelf;
        this.borrower = borrower;
    }

    public boolean isOnShelf() {
        return onShelf;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" + "      Author: " + author + "\n" +
                "      Edition: " + edition + "\n" + "      Published: " +
                published + "\n" + "      Category: " + category + "\n" +
                "      On-shelf: " + onShelf + "\n" + "      Borrower: " + borrower;
    }
}

