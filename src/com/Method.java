package com;

import javax.print.CancelablePrintJob;
import javax.sound.midi.Track;

class Test{
    String nama;
    String umur;
    String hobi;

    Test(String nama,String umur,String hobi){
        this.nama =  nama;
        this.umur = umur;
        this.hobi = hobi;
    }
    void getName(){
        System.out.println("nama : " +  this.nama);
    }
    String setName(String nama){
        this.nama = nama;
        return this.nama;
    }
    void getAllData(){
        System.out.println("nama : " + this.nama);
        System.out.println("umur : " + this.umur);
        System.out.println("hobi : " + this.hobi);
    }

    String sayHello(String messgge){
        return "halo selamat pagi " + this.nama;
    }
}

public class Method {
    public static void main(String[] args) {
       Test obj = new Test("alliano", "18", "coding");

       obj.getAllData();
       String say = obj.sayHello("hallo selamat pagi");
       System.out.println(say);
       String change = obj.setName("siska");
       System.out.println(change);

        
    }
    
}
