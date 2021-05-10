package com.tts;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<AddressBook> book = new ArrayList<>();
        int x = 1;
        while(x != 0) {//this loop just keeps the program running into an infinite loop
            System.out.println("1) Add an entry\n");
            System.out.println("2) Remove an entry\n");
            System.out.println("3) Search for a specific entry\n");
            System.out.println("4) Print Address Book\n");
            System.out.println("5) Delete book\n");
            System.out.println("6) Quit\n");
            System.out.println("Please choose what you would like to do with the database: ");

            Scanner scanner = new Scanner(System.in);

            int selection = scanner.nextInt();

            //adds a entry to the address book
            if (selection == 1) {
                System.out.print("First name: ");
                String theFname = scanner.next();
                System.out.print("Last name: ");
                String theLname = scanner.next();
                System.out.print("Phone #: ");
                String thePnum = scanner.next();
                System.out.print("Email: ");
                String theEmail = scanner.next();
                boolean bool = false;
                for (int i = 0; i < book.size(); i++) {
                    if (book.get(i).getEmail().equals(theEmail)) {
                        bool = true;
                    }
                }
                if(bool) {
                    System.out.println("\nEntry already exists in the phone \nNot adding this entry\n");
                }
                else {
                    AddressBook newEntries = new AddressBook(theFname, theLname, thePnum, theEmail);
                    book.add(newEntries);

                    System.out.println("Added new entry!");
                }
            }




            //remove entry by email
            else if (selection == 2) {
                System.out.print("Enter an entry's email to remove: ");
                String entry = scanner.next();

                for (int i = 0; i < book.size(); i++) {
                    if (book.get(i).getEmail().equals(entry)) {

                        System.out.println("Deleted the following entry: ");
                        System.out.println(book.get(i).toString());
                        book.remove(i);
                    }
                }
            }




            //can search for a substring within a string, this is case sensitive for now
            else if (selection == 3) {
                System.out.println("1) First Name");
                System.out.println("2) Last Name");
                System.out.println("3) Phone Number");
                System.out.println("4) Email Address");
                System.out.println("Choose a search type: ");
                int choice = scanner.nextInt();
                System.out.print("Enter your search: ");
                String searchThis = scanner.next();

                ArrayList<AddressBook> searchResults = new ArrayList<>();

                if (choice == 1) {
                    for (int i = 0; i < book.size(); i++) {
                        if (book.get(i).getFirstName().contains(searchThis)) {
                            searchResults.add(book.get(i));
                        }
                    }
                } else if (choice == 2) {
                    for (int i = 0; i < book.size(); i++) {
                        if (book.get(i).getLastName().contains(searchThis)) {
                            searchResults.add(book.get(i));
                        }
                    }
                } else if (choice == 3) {
                    for (int i = 0; i < book.size(); i++) {
                        if (book.get(i).getPhoneNum().contains(searchThis)) {
                            searchResults.add(book.get(i));
                        }
                    }
                } else if (choice == 4) {
                    for (int i = 0; i < book.size(); i++) {
                        if (book.get(i).getEmail().contains(searchThis)) {
                            searchResults.add(book.get(i));
                        }
                    }
                } else {
                    System.out.println("Invalid search option");
                }
                System.out.println("******************");
                for (int i = 0; i < searchResults.size(); i++) {
                    System.out.println(searchResults.get(i).toString());
                    System.out.println("******************");
                }
            }




            //Prints the entire address book
            else if (selection == 4) {
                System.out.println("******************");
                for (int i = 0; i < book.size(); i++) {
                    System.out.println(book.get(i).toString());
                    System.out.println("******************");
                }
            }




            //deletes the entire address book
            else if (selection == 5) {
                book = new ArrayList<>(); //just creates a new list and changes the address, old book still exists in memory I believe
                System.out.println("Address book cleared!");
            }



            //quits the program
            else if (selection == 6) {
                x = 0; //value is checked in the while loop and quits the program
            } else {
                System.out.println("Input is incorrect");
            }
        }
    }
}
