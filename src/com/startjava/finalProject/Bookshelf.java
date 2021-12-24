package com.startjava.finalProject;

public class Bookshelf {
    private int booksCount;
    private Book[] bookshelf;

    public Bookshelf() {
        this.booksCount = 0;
        this.bookshelf = new Book[10];
    }

    public int getBooksCount() {
        return booksCount;
    }

    public Book[] getBookshelf() {
        return bookshelf;
    }

    public void printBookshelf() {
        for (Book book : bookshelf) {
            if (book == null) {
                System.out.println("[ ]");
            }
            else {
                System.out.println("[K]");
            }
        }
    }

    public void addBook(Book book) {
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i] == null) {
                bookshelf[i] = book;
                return;
            }
        }
    }

    public void deleteBook(Book book) {
        for (int i = 0; i < bookshelf.length; i++) {
            if (book.equals(bookshelf[i])) {
                bookshelf[i] = null;
            }
        }
    }
}
