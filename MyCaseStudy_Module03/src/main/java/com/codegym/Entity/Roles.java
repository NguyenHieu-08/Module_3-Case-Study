package com.codegym.Entity;

public class Roles {
    private int Id;
    private String name;

    public Roles() {}

    public Roles(String name) {
        this.name = name;
    }

    public Roles(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
