import java.util.List;
import java.util.Scanner;

import models.Person;
import service.PersonService;

public class Main {
    public static void main(String[] args) {

        PersonService personService = new PersonService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert 5 people");

        for (int i = 1; i < 6; i++) {
            System.out.println("ADD PERSON " + i);

            System.out.println("Add name: ");
            String name = scanner.nextLine();

            System.out.println("Add lastname: ");
            String lastName = scanner.nextLine();

            System.out.println("Add gender M/F: ");
            char gender = scanner.next().charAt(0);

            System.out.println("Add age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Person person = new Person(name, lastName, gender, age);

            if (person != null) {
                personService.create(person);
                System.out.println("This is a information person: " + person);

            }

        }
        System.out.println("Showing name and gender");
        List<String> result = personService.showNameAndGender();
        System.out.println(result);

        double averageAge = personService.averageAge();
        System.out.println("Average age: "+ averageAge);

        scanner.close();
    }
}