package se.liu.ida.gusso811.tddd78.lab2;

import java.time.LocalDate;

/**
 * Created by gurra on 4/13/16.
 */
public class teststack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        String namn = "Gustaf";
        LocalDate bday = LocalDate.of(1996, 2, 4);
        Person gus = new Person(namn, bday);
        stack.push(gus);
        stack.pop();


    }
}

