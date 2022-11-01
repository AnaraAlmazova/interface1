package com.company;

public class Pirog implements Backed{
    @Override
    public void eat() {
        System.out.println("Kiz pirog jedi");
    }

    @Override
    public String toString() {
        return "Pirog{}";
    }
}
