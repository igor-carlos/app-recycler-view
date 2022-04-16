package com.example.app_recycler_view;

public class Contact {

    private String name;
    private String cellphone;
    private int backgroundColor;

    public Contact(String name, String cellphone, int backgroundColor) {
        this.name = name;
        this.cellphone = cellphone;
        this.backgroundColor = backgroundColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

}
