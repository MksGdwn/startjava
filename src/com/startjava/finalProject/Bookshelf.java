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
                System.out.print("[ ]");
            }
            else {
                System.out.print("[K]");
            }
        }
        System.out.println();
    }

    public void addBook(Book book) {
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i] == null) {
                bookshelf[i] = book;
                booksCount++;
                return;
            }
        }
    }

    public void deleteBook(Book book) {
        for (int i = 0; i < bookshelf.length; i++) {
            if (book.equals(bookshelf[i])) {
                bookshelf[i] = null;
                booksCount--;
            }
        }
    }

    public void findBook(Book book) {
        for (Book obj : bookshelf) {
            if(obj == null) {
                continue;
            }
            if (obj.getTitle().equals(book.getTitle())) {
                System.out.println(book);
                return;
            }
        }

        System.out.println("Book with the title " + book.getTitle() + " not found.");
    }

    public int getFreeSpace() {
        return getBookshelf().length - getBooksCount();
    }
}
