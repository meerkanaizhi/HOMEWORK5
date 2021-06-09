package com.company;

import java.util.Arrays;

public class magicdoor {
    public static void main (String[] args){

        String[] names = new String[4];
        names[0] = "Iron man";
        names[1] = "Big";
        names[2] = "Meri";
        names[3] = "Cat";

        String[] namesNew = Arrays.copyOf(names, names.length + 1 );
        namesNew [4] = "Lili";
        System.out.println(namesNew.length);
        System.out.println(namesNew[0]);

    }
}
