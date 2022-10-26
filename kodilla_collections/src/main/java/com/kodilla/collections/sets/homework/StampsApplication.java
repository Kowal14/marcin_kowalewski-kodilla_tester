package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Polska", 4.5, true));
        stamps.add(new Stamp("Niemcy" , 3.6, false));
        stamps.add(new Stamp("Włochy", 5.1, true));
        stamps.add(new Stamp("Polska", 4.5, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
