package com.tryning;


// seter dan geter


class Azzahra{
    private String tinggi;
    private String Cinta;
    private String PertamaPacaran;


    // jika data membert memiliki acess modifiernya Privat dan protectred data member tersebut hanya bisa di akses kelas itu sendiri maka dari itu kita mambutuhkan seter dan getter
    Azzahra(String tinggi,String Cinta,String PerttamaPAcaran){
        this.tinggi = tinggi;
        this.Cinta = Cinta;
        this.PertamaPacaran = PerttamaPAcaran;
    }

    // seter dann geter memungkinkan kita untuk dapat mengakses data member yang ber sifat Privat dan Protected 

    // seter dan geter memungkinkan kita memberi hak akses read atau write || read only write only

    // contoh geter read only

    public void getAll(){
        // this disini akan mengacu ke Parent Object
        System.out.println("\ntinginya dia : " + this.tinggi);
        System.out.println("Dia mencintai : " + this.Cinta);
        System.out.println("aku dan Azahra pertama kali pacaran saat : " + this.PertamaPacaran);
    }

    // contoh seter write Only
    public void setAll(String tinggi,String Cinta,String PertamaPacaran){
        this.tinggi = tinggi;
        this.Cinta = Cinta;
        this.PertamaPacaran = PertamaPacaran;
    }

    // set dan get dan read write 
    public void getsetData(String tinggi,String cinta,String pertamaPacaran){
        this.tinggi = tinggi;
        this.Cinta = cinta;
        this.PertamaPacaran = pertamaPacaran;

        getAll();
    }

} 

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

   public double getJari_jari(double jari){
        return this.diameter * jari;
    }
}

public class SeterGeter {
   public static void main(String[] args) {

    // instansisasi Obj Azahra
    
    Azzahra sayang1 = new Azzahra("160cm", "Alliano", "dipantai tepatnya pada tanggal 14 febuary");
    
    // contoh gettet read only
    sayang1.getAll();

    // contoh setet write only

    sayang1.setAll("150", "gtw", "aku jga gatau");


    // data member yang bersifat privat kita tidak bisa akses langsung dari class lain klo ga percaya mari kita buktikan

        // sayang1.tinggi;//kan error karan itu privat

        // contoh read write 

        sayang1.getsetData("150", "alliano","saat di Taman batas kota " );


        // seter me return suatu nilai

        Lingkaran lingkaran1 = new Lingkaran(100);
        System.out.println(lingkaran1.getJari_jari(4));
   } 
}
