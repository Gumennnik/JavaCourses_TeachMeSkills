package Classwork09;

import java.util.*;

public class Classwork09Runner {
    public static void main(String[] args) {
//        Hospital hospital = new Hospital();
////
////        hospital.addPersonToQueue(new Person("Gena", 144));
////
////        hospital.addPersonToQueue(new Person("Vasya", 14));
////
////        hospital.addPersonToQueue(new Person("Olga", 90));
////
////        hospital.start();
////
////
////        hospital.addPersonToQueue(new Person("Natasha", 22));
////
////        hospital.addPersonToQueue(new Person("Petya", -5));
////
////        hospital.setDoctor(new Doctor("Death", "Crematory"));
////
////        hospital.start();


        Set set = new TreeSet<Person>( (Person o1, Person o2) -> {
                return o1.getAge() - o2.getAge();
            } );
        set.add(new Person("beo",10));
        set.add(new Person("leo",14));

        System.out.println(set);

    }

}
