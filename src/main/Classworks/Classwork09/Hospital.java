package Classwork09;

import java.util.ArrayDeque;
import java.util.Queue;

public class Hospital {
    private Doctor doctor;
    private Queue<Person> personQueue = new ArrayDeque<>();

    public Hospital() {
    }


    public void start() {
        if (doctor == null) {
            System.out.println("No doctor here");
            return;
        }

        System.out.println("Doctor " + doctor.getName() + " started working");
        Person person;
        while (!personQueue.isEmpty()) {
            person = personQueue.poll();
            System.out.println(person + " entered the room");
            System.out.println(person + " being healed");
            System.out.println(person + " Leave the room");
        }

        return;

    }


    public void addPersonToQueue(Person person) {
        personQueue.offer(person);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Queue<Person> getPersonQueue() {
        return personQueue;
    }

    public void setPersonQueue(Queue<Person> personQueue) {
        this.personQueue = personQueue;
    }
}
