package com.xworkz.encapsulation.internal;

public class M_Mutator {
    Mutant mutant;
    public M_Mutator(Mutant mutant){
        this.mutant = mutant;
        System.out.println("Mutator const");
    }
    public void mutator() {
        Mutant mutant = new Mutant();
        mutant.setName("Charles Xavier");
        mutant.setAge(78);
        mutant.setAbility("Telekinesis");
        mutant.setControl("Full Control");
        mutant.setRecruited(true);
        System.out.println("Name: "+mutant.getName());
        System.out.println("Age: "+mutant.getAge());
        System.out.println("Ability: "+mutant.getAbility());
        System.out.println("Control: "+mutant.getControl());
        System.out.println("Recruited?: "+mutant.getRecruited());
    }

}
