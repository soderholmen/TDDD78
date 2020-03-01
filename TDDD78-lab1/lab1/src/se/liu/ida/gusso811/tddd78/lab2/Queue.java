package se.liu.ida.gusso811.tddd78.lab2;

import java.util.ArrayList;
import java.util.List;


public class Queue {
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

    public void enqueue(Person person){
        elements.add(person);
    }

    public Object dequeue(){
        elements.remove(0);
        return elements.get(0).toString();
    }
    }
