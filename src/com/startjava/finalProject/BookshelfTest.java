package com.startjava.finalProject;

import java.util.Scanner;

public class BookshelfTest {
    private static Scanner scanner = new Scanner(System.in);
    private static Bookshelf bookshelf = new Bookshelf();
    private static Menu menu = Menu.MAIN_MENU;
    private static boolean isWorking = true;

    public static void main(String[] args) {
        while (isWorking) {
            switch (menu) {
                case MAIN_MENU:
                    bookshelf.printBookshelf();
                    printMenu();
                    System.out.print("Choose an action: ");
                    String userInput = getUserInput();
                    switch (userInput) {
                        case "1":
                            menu = Menu.ADD_BOOK;
                            break;
                        case "2":
                            menu = Menu.DELETE_BOOK;
                            break;
                        case "3":
                            menu = Menu.FIND_BOOK;
                            break;
                        case "4":
                            System.out.println(bookshelf.getBooksCount());
                            break;
                        case "5":
                            System.out.println(bookshelf.getFreeSpace());
                            break;
                        default:
                            isWorking = false;
                            System.out.println("Goodbye!");
                    }
                    break;
                case ADD_BOOK:
                    System.out.print("Enter book author: ");
                    String author = getUserInput();

                    System.out.print("Enter book title: ");
                    String title = getUserInput();

                    System.out.print("Enter book publication year: ");
                    int year = Integer.parseInt(getUserInput());

                    bookshelf.addBook(new Book(author, title, year));

                    System.out.println("The book was created");

                    menu = Menu.MAIN_MENU;
                    break;
                case DELETE_BOOK:
                    System.out.print("Enter book title: ");
                    title = getUserInput();

                    for (Book book : bookshelf.getBookshelf()) {
                        if (book == null) {
                            continue;
                        }
                        if (book.getTitle().equalsIgnoreCase(title)) {
                            System.out.println("Book found:");
                            System.out.println(book);
                            System.out.println("Do you want to delete the book?");
                            String userAnswer = getUserInput();

                            if (userAnswer.equalsIgnoreCase("yes")) {
                                bookshelf.deleteBook(book);
                                System.out.println("The book was deleted");
                            }
                        }
                    }
                    menu = Menu.MAIN_MENU;
                    break;
                case FIND_BOOK:
                    System.out.print("Enter book title: ");
                    title = getUserInput();
                    Book book = findBook(title);

                    if (book == null) {
                        System.out.println("The book " + title + " was not found.");
                    }
                    else {
                        System.out.println(book);
                    }

                    menu = Menu.MAIN_MENU;
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available options:\n" +
                "1 - Add new book\n" +
                "2 - Delete book\n" +
                "3 - Find and display book\n" +
                "4 - Show number of books\n" +
                "5 - Show amount of free space\n" +
                "6 - Exit");
    }

    private static String getUserInput() {
        return scanner.nextLine();
    }

    private static Book findBook(String title) {
        for (Book book : bookshelf.getBookshelf()) {
            if (book == null) {
                continue;
            }
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }
}
