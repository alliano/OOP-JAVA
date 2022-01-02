package com.tryning;




class Player{
    String name;
    double healty;
    int level;
    Weapon weapon;
    Armor armor;

    Player(String name,double healthy){
        this.name = name;
        this.healty = healthy;
    }
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    void display(){
        System.out.println("\nname : " + this.name);
        System.out.println("healthy : " + this.healty);

        this.weapon.display();
        this.armor.display();
    }
}

class Weapon{
    double attackPower;
    String name;

    Weapon(String name,double attackPower){
        this.attackPower = attackPower;
        this.name = name;
    }
    void display(){
        System.out.println("Weapon : " + this.name + " | " + " Attack power : " + this.attackPower);
    }
}

class Armor{
    double definePower;
    String name;

    Armor(String name,double definePower){
        this.definePower = definePower;
        this.name = name;
    }
    void display(){
        System.out.println("Armor : " + this.name + " | " + "define power : " + this.definePower);
    } 
}
public class Main {
    public static void main(String[] args) {

        //cearte Obj player obj player1 || instance obj
        Player player1 = new Player("alliano", 100);
        Player player2 = new Player("memek", 200);

        // create Obj weapon || instance obj
        Weapon tor = new Weapon("tor",1000);
        Weapon pistol = new Weapon("pistol", 100);

        // crate obj Armor || instance obj
        Armor Iron = new Armor("Iron",1000);
        Armor kayu = new Armor("baju kayu", 100);
        


        player1.equipWeapon(tor);
        player1.equipArmor(Iron);
        player1.weapon.display();
        player1.display();
       
        player2.equipWeapon(pistol);
        player2.equipArmor(kayu);
        player2.weapon.display();
        player2.display();
    }
}
