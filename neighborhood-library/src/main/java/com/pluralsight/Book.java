package com.pluralsight;

public class Book {
     int id;
     String isbn;
    String title;
     boolean isCheckOut;
    String checkedOutTo;



    public Book(int id, String isbn, String title, boolean isCheckOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckOut = isCheckOut;
        this.checkedOutTo = checkedOutTo;
    }
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckOut() {
        return isCheckOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCheckOut(boolean checkOut) {
        isCheckOut = checkOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }




    public  void checkOut(String name) {
        // If user wants to checkout a book, set book's isCheckedOut to true and set checkedOutTo to user's name.
        if (!isCheckOut) {
            isCheckOut = true;
            checkedOutTo = name;
            System.out.println("The book is now checked out to " + name);
            // If the book is already checked out, print error.
        } else {
            System.out.println("The book is already checked out.");
        }
    }

    // Create the checkIn method.
    public void checkIn() {
        // If user wants to check in a book, set the book's isCheckedOut to false and clear checkedOutTo.
        if (isCheckOut) {
            isCheckOut = false;
            checkedOutTo = "";
            System.out.println("The book is now checked in.Thank you.");
            // If book has already been checked in, print error.
        } else {
            System.out.println("The book is already checked in.");
        }
    }



}
