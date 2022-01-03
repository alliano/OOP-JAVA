package com;

// memahami perilaku OBJECT

class House{
    int door;
    int window;
    String floor;

    House(int door,int window,String floor){
        this.door = door;
        this.window = window;
        this.floor = floor;
    }

    void display(){
        System.out.println("\nthe House have : "+this.door + " door");
        System.out.println("the House have : "+this.window + " window");
        System.out.println("the House have : "+this.floor +" floor");
    }
}
public class TestObj {
    public static void main(String[] args) {
        House rumah1 = new House(2, 5, "ada");

        rumah1.display();

        // disini say akan menamoilkan addres memory dari suatu Instance Object

        String data = Integer.toHexString(System.identityHashCode(rumah1));
        System.out.println(data + " -->ini adalah Addres memo dari Obj rumah");

        // Obj tidak bisa di Assign ... jika kamu ssign maka si addres nya akan sama contoh

        House rumah2 = rumah1;
        rumah2.display();
        String data2 = Integer.toHexString(System.identityHashCode(rumah2));
        // ini aknan menghasilkan addres memo yang sama .. jadi si java tidak mengcoppy dari Obj diatas
        rumah2.display();


        // karna rumah1 dan rumah2 berada pada addres memo yang sama maka setiap ada perubahan pada suatu object maka  si rumah2 juga akan berubah karna ada di memo dan referen yang sama contohh

        // ini akan mempengaruhi pda ke 2 obj(rumah1 dan rumah2)
        rumah1.door = 200;
        rumah1.display();
        rumah2.display();

        // walaupun kita parsing by reference ini tidakakan membuat addres nya menjadi beda contoh kita akan pase mngunakan function
        parse(rumah1);
        rumah1.display();
        rumah2.display();
    
    }
    public static void parse(House rumaHouse){
        String dataRumah = Integer.toString(System.identityHashCode(rumaHouse));
        System.out.println(dataRumah);
        // ini akan mempengaruh ke 2 obj 
        rumaHouse.window = 400;
    }




    // NOTE  : untuk meng hindari hal tersebut maka kita harus mempelajari tntang encapsulation atau hak akses atau access modifier public privat protected
    
}
