package com.tecspeak.collection;

import java.util.HashSet;
import java.util.Set;

class Institute {
    Set<String> languages = new HashSet<>();

    Institute(){
        this.languages.add("C");
        this.languages.add("C++");
        this.languages.add("JAVA");
        this.languages.add("Python");
    }
}

public class HashsetExample {

    public static void main(String[] args) {
        Institute institute = new Institute();

        for (String lang : institute.languages) {
            System.out.println(lang);
        }

        institute.languages.add("HTML");
        institute.languages.remove("Python");


        for (String lang : institute.languages) {
            System.out.println(lang);
        }
    }

}
