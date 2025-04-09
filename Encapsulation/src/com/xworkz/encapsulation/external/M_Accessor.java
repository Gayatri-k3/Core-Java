package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Mutant;

public class M_Accessor {
    Mutant mutant;
    public M_Accessor(Mutant mutant){
        this.mutant= mutant;
        System.out.println("Accessor const");
    }
    public void show(){
        System.out.println("Name: "+mutant.getName());
        System.out.println("Age: "+mutant.getAge());
        System.out.println("Ability: "+mutant.getAbility());
        System.out.println("Control: "+mutant.getControl());
        System.out.println("Recruited?: "+mutant.getRecruited());
    }
}
