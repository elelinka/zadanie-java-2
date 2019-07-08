package com.google;

public class Main {

    public static void main(String[] args) {
        Electronics electronics1 = new Electronics("telewizor", 50.0, "LG");
        Electronics electronics2 = new Electronics("telefon", 8.2, "Samsung");

//        electronics1.name = "telewizor";
//        electronics1.size = 50.0;
//        electronics1.brand = "LG";

        System.out.println("Produkt pierwszy: " + electronics1.name + " , rozmiar: " + electronics1.size + " , marka: " + electronics1.brand);

//        electronics2.name = "telefon";
//        electronics2.size = 8.2;
//        electronics2.brand = "Samsung";

        System.out.println("Produkt drugi: " + electronics2.name + " , rozmiar: " + electronics2.size + " , marka: " + electronics2.brand);

    }

}
