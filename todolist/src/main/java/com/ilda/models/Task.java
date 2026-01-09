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

    public String getTaskName(){

        return this.name;

    }

    public String getTaskDescription(){

        return this.description;

    }

    public boolean getTaskChecked(){

        return this.checked;

    }

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
