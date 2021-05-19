package com.example.springboottutorial;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
    private int lib;
    private String brand;

    public int getLib() {
        return lib;
    }

    public void setLib(int lib) {
        this.lib = lib;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lib=" + lib +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void compile()
    {
        System.out.println("Compiling");
    }

}
