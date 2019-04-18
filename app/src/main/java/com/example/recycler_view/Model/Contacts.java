package com.example.recycler_view.Model;

public class Contacts {
    private String name;
    private String phoneNo;
    private int imageID;


    public Contacts(String name, String phoneNo, int imageID) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
