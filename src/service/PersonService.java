package service;

import java.util.LinkedList;
import java.util.List;

import models.Person;

public class PersonService {
    public static List<Person> people = new LinkedList<>();
    
    public void create(Person person) {
        if (person.getGender() == 'M'|| person.getGender() == 'F') {
            people.add(person);
            System.out.println("added successfullyy");
        }else{
            throw new IllegalArgumentException("Invalid Gender");
        }

    }

    public List<Person> findAll() {
        if (people.isEmpty()) {
            System.out.println("There are no people");
        }
        return people;
    }

    public Person findById(int id) {
        for (Person person : people) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void update(int id, Person person) {
        Person existingPerson = findById(id);
        if (existingPerson != null) {
            existingPerson.setName(person.getName());
            existingPerson.setLastName(person.getLastName());
            existingPerson.setGender(person.getGender());
            existingPerson.setAge(person.getAge());
            System.out.println("Person updated successfully");
        }
        System.out.println("Person not found");
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
        System.out.println("Person eliminated");
    }

    public List<String> showNameAndGender() {
        List<String> test = new LinkedList<String>();
        for (Person person : people) {
            String name = person.getName();
            char gender = person.getGender();
            String nameAndGender = "Name: " + name + " Gender: " + gender;
            test.add(nameAndGender);
        }
        return test;

    }

    public double averageAge() {
        double sum = 0;
        for (Person person : people) {
            sum = sum + person.getAge();
        }
        return sum / people.size();

    }

    public int peopleWithGenderM() {
        int count = 0;
        for (Person person : people) {
            if (person.getGender() == 'M') {
                count++;
            }
        }
        return count;
    }

    public int peopleWithGenderF() {
        int count = 0;
        for (Person person : people) {
            if (person.getGender() == 'F') {
                count++;
            }
        }
        return count;
    }

}
