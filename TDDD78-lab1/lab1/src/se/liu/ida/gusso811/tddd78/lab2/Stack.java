package se.liu.ida.gusso811.tddd78.lab2;

import java.util.ArrayList;
import java.util.List;


public class Stack {
    private List<Person> elements = new ArrayList<>();

    public int size(){
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public boolean contains(Object o) {
        return elements.contains(o);
    }

    public void clear() {
        elements.clear();
    }

    public void push(Person person){
        elements.add(person);
    }

    public String pop(){
        Object temp = elements.get(elements.size()-1);
        elements.remove(elements.size()-1);
        return temp.toString();
    }
    }
