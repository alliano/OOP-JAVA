package com.tryning;

import java.net.ContentHandler;

class Mylove{
    String dia;//properti aini akan bisa di akses di mma saja walaupun beda class
    public String love;//ini jga sama bisa di akses di mna saja;
    private String aku;//properti ini tidakakan bisa di gunakan di lain class di ahanya bisa di gunakan di dalam class
    private String kamu;
    

    Mylove(String dia,String aku,String kamu,String love){
        this.aku = aku;
        this.kamu = kamu;
        this.love = love;
        this.dia = dia;
    }

    // untuk mengkases properti privat
    void getAll(){//void adalah fungsi yang tidak akan me return apa2
        System.out.println("dia adalah : " + this.dia);
        System.out.println("aku adalah : " + this.aku + " akan selalu menyayangi " + this.kamu);
        System.out.println("aku akan mencintai kamu : " + this.love);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Mylove cinta = new Mylove("Orang ke 3", "alliano", "dear secret", "forever");

        // ini jika aku memngkases properti dia  ini akan bisa contoh
        // public
        String dia = cinta.dia;
        System.out.println(dia);

        // privat

        // jika kita mau mengkases proverti privat ini akan tidak bisa karna privat hanya bisa di akses di dalam class tersebut klo ga percaya ayok kita biktikan kita akan me r w(read write)

        // String data = cinta.kamu;//me read
        // String data2 = cinta.kamu = "layla";//me write

        // cara mengakses method privat
        cinta.getAll();
    }
    
}
