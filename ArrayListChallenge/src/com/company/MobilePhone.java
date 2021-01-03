package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts = new ArrayList<>();

    public void addContact(Contact c) {
        if(contactExists(c)) {
            System.out.println("Contact already exists.");
        } else {
            myContacts.add(c);
            System.out.println("Contact added.");
        }
    }

    private boolean contactExists(Contact c) {
        for (Contact contact : myContacts) {
            if(contact.getName().equals(c.getName())) return true;
        }
        return false;
    }


}
