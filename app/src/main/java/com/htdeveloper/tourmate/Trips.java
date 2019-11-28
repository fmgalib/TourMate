package com.htdeveloper.tourmate;

public class Trips {
    private String name;
    private String about;

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public Trips() {
    }

    public Trips(String name, String about) {
        this.name = name;
        this.about = about;
    }
}
