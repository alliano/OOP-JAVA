package com;

class car{
    String color;
    String merek;
    int harga;
    String tipe;
}


public class Main {
    public static void main(String[] args) {
        car mobil = new car();

        mobil.color = "red";
        mobil.merek = "Lamborgini";
        mobil.harga = 10000000;
        mobil.tipe = "sport";

        System.out.println(mobil.color);
        System.out.println(mobil.merek);
        System.out.println(mobil.harga);
        System.out.println(mobil.tipe);
    }
}



