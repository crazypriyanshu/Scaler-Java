package main.java.DesignPatterns.Structural.Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> studentMap = new HashMap<>();

    void register(String key, Student student) {
        studentMap.put(key, student);
    }

    Student get(String key) {
        return studentMap.get(key);
    }
}
