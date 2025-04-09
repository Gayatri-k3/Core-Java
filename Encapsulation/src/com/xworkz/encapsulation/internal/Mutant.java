package com.xworkz.encapsulation.internal;

public class Mutant {
    private String name = "SunFire";
    private int age = 19;
    private String ability = "fire or solar";
    private String control = "Full control";
    private boolean recruited = true ;

    public Mutant(){
        System.out.println("Mutant Constructor");
    }

    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age=age;
    }
    void setAbility(String ability){
        this.ability=ability;
    }
    void setControl(String control){
        this.control=control;
    }
    void setRecruited(boolean recruited){
        this.recruited=recruited;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getAbility(){
        return this.ability;
    }
    public String getControl(){
        return this.control;
    }
    public boolean getRecruited(){
        return this.recruited;
    }
}
