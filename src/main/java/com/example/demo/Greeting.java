package com.example.demo;

public class Greeting {

    Greeting(String Name)
    {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;

}
