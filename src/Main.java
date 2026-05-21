import java.util.Scanner;

import models.Person;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert 5 people");

        for(int i = 1; i < 6; i++){
            System.out.println("ADD PERSON "+i);

            System.out.println("Add name: ");
            String name = scanner.nextLine();

            System.out.println("Add lastname: ");
            String lastName = scanner.nextLine();

            System.out.println("Add gender M/F: ");
            String gender = scanner.nextLine().toUpperCase();

            System.out.println("Add age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            scanner.close();

            Person person = new Person(name, lastName, gender, age);

            if (person != null) {
                System.out.println("This is a information person: "+person);
            }
        }
        
    }
}