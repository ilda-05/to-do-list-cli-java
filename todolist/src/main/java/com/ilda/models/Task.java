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

    // GETTERS

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isChecked() {
        return checked;
    }

    // SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    

}
