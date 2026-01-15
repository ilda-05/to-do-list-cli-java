package com.ilda.models;

public class Task {

    private Long id;
    private String name;
    private String description;
    private boolean checked;



    public Task(String name, String description){

        this.name=name;
        this.description=description;
        this.checked=false;

    }

    // GETTERS

    public Task() {
        //TODO Auto-generated constructor stub
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Task [id=" + id + ", name=" + name + ", description=" + description + ", checked=" + checked + "]";
    }

    

}
