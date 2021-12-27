package com.startjava.finalProject;

import java.util.Scanner;

public class BookshelfTest {
    private static Scanner scanner = new Scanner(System.in);
    private static Bookshelf bookshelf = new Bookshelf();
    private static Menu menu = Menu.MAIN_MENU;

    public static void main(String[] args) {
        while (true) {
            switch (menu) {
                case MAIN_MENU:
                    bookshelf.printBookshelf();
                    printMenu();
                    System.out.print("Choose an action: ");
                    String userInput = scanner.nextLine();
                    switch (userInput) {
                        case "1":
                            menu = Menu.ADD_BOOK;
                            break;
                        case "2":
                            menu = Menu.DELETE_BOOK;
                            break;
                        case "3":
                            break;
                        case "4":
                            bookshelf.getBooksCount();
                            break;
                        case "5":
                            bookshelf.getFreeSpace();
                            break;
                    }
                    break;
                case ADD_BOOK:
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter book publication year: ");
                    int year = scanner.nextInt();

                    bookshelf.addBook(new Book(author, title, year));

                    System.out.println("Book creating.");

                    menu = Menu.MAIN_MENU;
                    break;
                case DELETE_BOOK:
                    menu = Menu.MAIN_MENU;
                    break;
                case FIND_BOOK:
                    menu = Menu.MAIN_MENU;
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available options:\n" +
                "1 - Add new book\n" +
                "2 - Delete book\n" +
                "3 - Find and display book\n" +
                "4 - Show number of books\n" +
                "5 - Show amount of free space");
    }
}
