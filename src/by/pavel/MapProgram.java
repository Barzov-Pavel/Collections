package by.pavel;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled object-oriented language");
        languages.put("Python", "an interpreted object-oriented language");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "beginners language");

        System.out.println(languages.get("Java "));
        System.out.println("================================");

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

        System.out.println(languages.replace("BASIC", "beginners language for studying programing languages"));
        System.out.println(languages.replace("Scala", "don't exist"));

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
