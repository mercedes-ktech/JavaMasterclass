package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "high level object oriented platform independent language");
        languages.put("Python", "an intepreted, object oriented, high level programming language with dynamic semantics");
        languages.put("Algiol", "another language");
        System.out.println(languages.put("BASIC", "symbolic instruction code"));
        System.out.println(languages.put("Lisp", "therein lies madness"));

        System.out.println(languages.get("Java"));
        languages.put("Java", "this course is about java");
        System.out.println(languages.get("Java"));

        //languages.remove("Lisp");
        System.out.println(languages.replace("Lisp", "new value for Lisp"));
        System.out.println(languages.replace("Scala", "this won't work"));



        for(String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }

    }


}
