package se.liu.ida.gusso811.tddd78.lab2;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by gurra on 2/2/16.
 */
public class Person {
    public static void main(String[] args) {
        String namn = "Gustaf";
        LocalDate bday = LocalDate.of(1996, 2, 4);
        Person gus = new Person(namn, bday);
        System.out.println(gus.toString());
    }
    private String namn;

    private LocalDate birthDay;

    public Person(String namn, LocalDate birthDay) {
        this.birthDay = birthDay;
        this.namn = namn;
    }
    public int getAge(){
        return Period.between(this.birthDay, LocalDate.now()).getYears();

    }

    @Override
    public String toString() {
        return "Person{"+ namn + '\'' +
                getAge() +
                '}';
    }

}

