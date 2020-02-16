package com.AaronMasterClass;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
//        java.util.Map<String, String> languages = new HashMap<>();//used java.util because package name was same as class
        Map<String, String> languajes = new HashMap<>();

        if (languajes.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languajes.put("Java", "A compiled high level, object-oriented, platform independant language");
            System.out.println("Java added succesfully");
        }

        languajes.put("Java", "A compiled high level, object-oriented, platform independant language");
        languajes.put("Python", "an interpreted, object-oriented, high-level programming languaje with dynamic semantics");
        languajes.put("Algo", "an algorithmic language");
        languajes.put("BASIC", "Beginners All purposes Symbolic Intruction Code");
        languajes.put("Lisp", "Therein lies madness");
        languajes.put("Javascript", "an interpreted, web- based , object-oriented, high-level programming language with dynamic semantics" );

//        System.out.println(languajes.get("Java"));
//        languajes.put("Java", "java masterclass");
//        System.out.println(languajes.get("Java"));

        if (languajes.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languajes.put("Java", "Masterclass");
        }

        System.out.println("========================");
        for (String key : languajes.keySet()){
            System.out.println(key + " : " + languajes.get(key));
        }
    }
}
