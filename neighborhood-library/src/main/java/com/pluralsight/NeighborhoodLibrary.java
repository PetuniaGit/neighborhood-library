package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    static Scanner scan=new Scanner(System.in);
    static Book[] books=new Book[10];
    static int userinput;
    static String wantToCheckOut;
    static String wantToCheckIn;
    static int checkOutBook;
    static int checkInBook;


    public static void collectionOfBooks(){
        Book[] books=new Book[10];
        books[0]=new Book(1,"98364830497","The Great Gatsby",true,"F. Scott Fitzgerald");
        books[1]=new Book(2,"9836483758","To Kill a Mockingbird",false," ");
        books[2]=new Book(3,"98364856798","1984",false," ");
        books[3]=new Book(4,"983648432438","Pride and Prejudice",false," ");
        books[4]=new Book(5,"983649870958","Moby-Dick",true," Harper Lee");
        books[5]=new Book(6,"9836408958","The Catcher in the Rye",false," ");
        books[6]=new Book(7,"983676586758","The Hobbit",false," ");
        books[7]=new Book(8,"98343253758","The Grapes of Wrath",false," ");
        books[8]=new Book(9,"6858686483758","Brave New World",false," ");
        books[9]=new Book(10,"9839890983758","Crime and Punishment",false," ");

    }
    public static void userInput (){
        System.out.println( " what would you like to do?");
        System.out.println( " Enter 1 to show available books.");
        System.out.println( " Enter 2 to show checked out books.");
        System.out.println(" Enter 3 to exit.");
        userinput=scan.nextInt();
        if (userinput==1){
            showAvailableBooks();
        }
        else if(userinput==2){
            showCheckedOutBooks();
        }
        else if (userinput==3){
            return;
        }
    }
    public static void showAvailableBooks(){
        System.out.println("The Available books are:");
        for (Book book:books){
            if (!book.isCheckOut()){
                System.out.println("Title: " + book.getTitle() + " - " + "ID: " + book.getId() + " - " + "ISBN: " + book.getIsbn());
            }
        }
        System.out.println(" Do you want to check out a booK? Enter yes or no. ");
        wantToCheckOut=scan.nextLine();
        if (wantToCheckOut.equalsIgnoreCase("yes")){
            checkOutBook();
        }
        else if (wantToCheckOut.equalsIgnoreCase("no")){
            userInput();
        }


    }



    public static void showCheckedOutBooks(){
        System.out.println("These are the checked out books:");
        for (Book book:books){
            if (book.isCheckOut()){
                System.out.println("Title: " + book.getTitle() + " - " + "ID: " + book.getId() + " - " + "ISBN: " + book.getIsbn());
            }}
        System.out.println("What would you like to do?");
        System.out.println("Enter C to Check In A Book.");
        System.out.println("Enter X to Go Back to Home Screen.");
        wantToCheckIn = scan.nextLine();

        if (wantToCheckIn.equalsIgnoreCase("C")){
            checkInBook();
        }
        else if (wantToCheckIn.equalsIgnoreCase("X")) {
               userInput();
        }


    }

    private static void checkInBook() {
    }

    private static void checkOutBook() {
    }

}
