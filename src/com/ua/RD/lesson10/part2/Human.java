package com.ua.RD.lesson10.part2;

import java.util.Objects;

public class Human {


    private String name;
    private String lastName;

    public Human(){
        System.out.println("AE");
    }

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        System.out.println("AF");
    }

    public void work() {
        System.out.println("i`m working");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        return lastName != null ? lastName.equals(human.lastName) : human.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
