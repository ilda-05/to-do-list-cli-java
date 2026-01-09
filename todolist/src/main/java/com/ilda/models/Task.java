package com.ilda.models;

public class Task {

    private String name;
    private String description;
    private boolean checked;

    public Task(String name, String description){

        this.name=name;
        this.description=description;
        this.checked=false;

    }

}
