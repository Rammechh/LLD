package DesignPatterns.CreationalDesignPattern.PrototypeDP.Example2;

import java.util.HashMap;
import java.util.Map;

public class NotebookRegistry {
    Map<String, Notebook> notebooks = new HashMap<>();

    void registerNotebook(String name, Notebook notebook){
        notebooks.put(name, notebook);
    }

    Notebook getNotebook(String name){
        return notebooks.get(name).clone();
    }
}
