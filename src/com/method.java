package com;

class test{
    String nama;
    String umur;
    String hobi;

    test(String nama,String umur,String hobi){
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
        return "halo selamat pagi" + this.nama;
    }
}

public class method {
    public static void main(String[] args) {
       test obj = new test("alliano", "18", "renang");
       obj.setName("jancok");

        
    }
    
}
