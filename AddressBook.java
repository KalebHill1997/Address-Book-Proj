package com.tts;

public class AddressBook {
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String email;

    public AddressBook() {
        this.firstName = "noFirstName";
        this.lastName = "noLastName";
        this.phoneNum = "noPhoneNumber";
        this.email = "noEmailGiven";
    }

    public AddressBook(String firstName, String lastName, String phoneNum, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    //getters


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    //setters


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //tostring


    @Override
    public String toString() {
        return "First Name: " + firstName + '\n' +
                "Last Name: " + lastName + '\n' +
                "Phone: " + phoneNum + '\n' +
                "Email: " + email + '\n';
    }


}
