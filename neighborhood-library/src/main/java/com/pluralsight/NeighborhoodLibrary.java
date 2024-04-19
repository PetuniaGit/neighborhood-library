package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    static Scanner scan=new Scanner(System.in);
    static Book[] books=new Book[10];
    static int userInput;
    static String wantToCheckOut;
    static String wantToCheckIn;
    static int returnBook;
    static int  chooseBook;





    public static Book[] collectionOfBooks(){

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
        books[10]=new Book(11,"98364830497","Becoming",true,"F. Scott Fitzgerald");
        books[11]=new Book(12,"9836483758","The Power of Habit",false," ");
        books[12]=new Book(13,"98364856798","Atomic Habits",false," ");
        books[13]=new Book(14,"983648432438","All the Light We Cannot See",false," ");
        books[14]=new Book(15,"983649870958","The Book Thief",true," Harper Lee");
        books[15]=new Book(16,"9836408958","Educated",false," ");
        books[16]=new Book(17,"983676586758","Dune",false," ");
        books[17]=new Book(18,"98343253758","Harry Potter and the Sorcerer's Stone",false," ");
        books[18]=new Book(19,"6858686483758","Neuromancer",true," ");
        books[19]=new Book(20,"9839890983758","The Name of the Win",false," ");
        return books;

    }
    public static void userInput (){
        System.out.println( " Welcome to the Library ,what would you like to do?");
        System.out.println( " Enter 1 to show available books.");
        System.out.println( " Enter 2 to show checked out books.");
        System.out.println(" Enter 3 to exit.");
        userInput=scan.nextInt();
        if (userInput==1){
            showAvailableBooks();
        }
        else if(userInput==2){
            showCheckedOutBooks();
        }
        else if (userInput==3){
            return;
        }
    }
    public static void showAvailableBooks(){
        System.out.println("The Available books are:");
        for (Book book:books){
            if ((book != null) &&(!book.isCheckOut())){
                System.out.println("Title: " + book.getTitle() + " - " + "ID: " + book.getId() + " - " + "ISBN: " + book.getIsbn());
            }
        }
        System.out.println(" Do you want to check out a booK? Enter yes or no. ");
        wantToCheckOut=scan.next();

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
            if ((book != null) && (book.isCheckOut())){
                System.out.println("Title: " + book.getTitle() + " - " + "ID: " + book.getId() + " - " + "ISBN: " + book.getIsbn());
            }}
        System.out.println("What would you like to do?");
        System.out.println("Enter C to Check In A Book.");
        System.out.println("Enter X to Go Back to Home Screen.");
        wantToCheckIn = scan.next();

        if (wantToCheckIn.equalsIgnoreCase("C")){
            checkInBook();
        }
        else if (wantToCheckIn.equalsIgnoreCase("X")) {
               userInput();
        }


    }

    private static void checkInBook() {
        System.out.println("Please enter the ID of the book you want to check in from the available choices above:");
        returnBook=scan.nextInt();

        for (Book book : books) {
            if ( book.getId() == returnBook && book.isCheckOut()) {
                book.checkIn();
            }

            }


    }

    private static void checkOutBook() {
        System.out.print("Please enter the ID of the book you want to check out from the available choices above: ");
       chooseBook= scan.nextInt();

        // Create the variable.


        // Look for the book in the array using the entered ID.
        for (Book book : books) {
            if ((book != null) && (book.getId() == chooseBook )&& (!book.isCheckOut())) {
                System.out.print("Please enter your name: ");
                String name = scan.next();

                book.checkOut(name);
            }



    }


}

    public static void main(String[] args) {
       collectionOfBooks();
        userInput();
    }



}
