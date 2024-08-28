package com.xwork.practise.runner;

import com.xwork.practise.data.Bull;
import com.xwork.practise.data.CattleMan;
import com.xwork.practise.data.Farmer;
import com.xwork.practise.data.BulkyMan;
import com.xwork.practise.data.MuscularMan;
import com.xwork.practise.data.Pet;

public class PetRunner {

    public static void main(String[] args) {

        Pet pet = new Pet();
        pet.name="Rukh";
        pet.color="Black";
        pet.gender="Male";
        pet.cost=85635;
        pet.display();

        MuscularMan muscularMan = new Pet();
        muscularMan.name="Valor";
        muscularMan.color="Blackish brown";
        muscularMan.gender="Male";
        muscularMan.cost=75649;
        muscularMan.display();

        BulkyMan bulkyMan  = new MuscularMan();
        bulkyMan.name="Caspian";
        bulkyMan.color="White";
        bulkyMan.gender="Male";
        bulkyMan.cost=56372;
        bulkyMan.display();

        Farmer farmer = new BulkyMan();
        farmer.name="Gollath";
        farmer.color="Brown";
        farmer.gender="Male";
        farmer.cost=94762;
        farmer.display();

        CattleMan cattleMan= new Farmer();
        cattleMan.name="Thor";
        cattleMan.color="Black";
        cattleMan.gender="Male";
        cattleMan.cost=85736;
        cattleMan.display();

        Bull bull = new CattleMan();
        bull.name="Blaze";
        bull.color=" Brownish Black";
        bull.gender="Male";
        bull.cost=98435;
        bull.display();

    }
}
