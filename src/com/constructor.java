package com;



class test{
    String nama;
    String age;
    String faforite;
    String hobi;

    test(String nama,String age,String faforite,String hobi){
        nama = nama;
        age = age;
        faforite = faforite;
        hobi = hobi;

        System.out.println(nama);
        System.out.println(age);
        System.out.println(faforite);
        System.out.println(hobi);
    }
}

public class constructor {
    public static void main(String[] args) {
        new test("alliano", "18", "joging", "coding");
    }
    
}
