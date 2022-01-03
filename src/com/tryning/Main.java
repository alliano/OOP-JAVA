package com.tryning;

import java.security.DomainLoadStoreParameter;

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

    void attack(Player enemyPlayer){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " Attacking " + enemyPlayer.name + " wuth demage " + attackPower);
        
        enemyPlayer.deface(attackPower);
        
    }
    void deface(double attackPower){
        
        double demage;
        if(this.armor.definePower < attackPower){
            demage = attackPower - this.armor.definePower;
        }else{
            demage = 0;
            System.out.println(this.name + " gots demage " + attackPower);
        }
        this.healty -= demage;
        System.out.println(this.name + " gots demage " + demage);
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
        Player player2 = new Player("memek", 100);

        // create Obj weapon || instance obj
        Weapon tor = new Weapon("tor",100);
        Weapon pistol = new Weapon("pistol", 30);

        // crate obj Armor || instance obj
        Armor Iron = new Armor("Iron",100);
        Armor kayu = new Armor("baju kayu", 20);
        

        // player1
        player1.equipWeapon(tor);
        player1.equipArmor(Iron);
        player1.display();
    
       
        // player2
        player2.equipWeapon(pistol);
        player2.equipArmor(kayu);
        player2.display();
      
        System.out.println("\nBATTLE");
        System.out.println("\nEPS1");
        player1.attack(player2);
        player2.display();
        System.out.println("\nEPS2\n");
        player2.attack(player1);
        player1.display();
    }
}
