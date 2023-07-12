package main.java.PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> registryMap = new HashMap<>();

    void register(String key, Student student) {
        registryMap.put(key, student);
    }

    Student get(String key) {
        return registryMap.get(key);
    }
}
