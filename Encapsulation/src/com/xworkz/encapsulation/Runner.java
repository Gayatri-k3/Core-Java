package com.xworkz.encapsulation;

import com.xworkz.encapsulation.external.*;
import com.xworkz.encapsulation.internal.*;


public class Runner {
    public static void main(String[] args) {
        Mutant mutant = new Mutant();
        M_Mutator m_mutator = new M_Mutator(mutant);
        m_mutator.mutator();
        M_Accessor m_accessor = new M_Accessor(mutant);
        m_accessor.show();
        System.out.println();

        KeyChain keyChain = new KeyChain();
        K_Mutator k_mutator = new K_Mutator(keyChain);
        k_mutator.mutator();
        K_Accessor k_accessor = new K_Accessor(keyChain);
        k_accessor.show();
        System.out.println();

        Tank tank = new Tank();
        T_Mutator t_mutator = new T_Mutator(tank);
        t_mutator.mutator();
        T_Accessor t_accessor = new T_Accessor(tank);
        t_accessor.show();
        System.out.println();

        Badge badge = new Badge();
        B_Mutator b_mutator = new B_Mutator(badge);
        b_mutator.mutator();
        B_Accessor b_accessor = new B_Accessor(badge);
        b_accessor.show();
        System.out.println();

        PostOffice postOffice = new PostOffice();
        P_Mutator p_mutator = new P_Mutator(postOffice);
        p_mutator.mutator();
        P_Accessor p_accessor = new P_Accessor(postOffice);
        p_accessor.show();
        System.out.println();

        Occupation occupation = new Occupation();
        O_Mutator o_mutator = new O_Mutator(occupation);
        o_mutator.mutator();
        O_Accessor o_accessor = new O_Accessor(occupation);
        o_accessor.show();
        System.out.println();

        Jet jet = new Jet();
        J_Mutator j_mutator = new J_Mutator(jet);
        j_mutator.mutator();
        J_Accessor j_accessor = new J_Accessor(jet);
        j_accessor.show();
        System.out.println();

        Garage garage = new Garage();
        G_Mutator g_mutator = new G_Mutator(garage);
        g_mutator.mutator();
        G_Accessor g_accessor = new G_Accessor(garage);
        g_accessor.show();
        System.out.println();

        Gym gym = new Gym();
        GYM_Mutator gym_mutator = new GYM_Mutator(gym);
        gym_mutator.mutator();
        GYM_Accessor gym_accessor = new GYM_Accessor(gym);
        gym_accessor.show();
        System.out.println();

        Apartment apartment = new Apartment();
        A_Mutator a_mutator = new A_Mutator(apartment);
        a_mutator.mutator();
        A_Accessor a_accessor = new A_Accessor(apartment);
        a_accessor.show();
        System.out.println();
    }
}
