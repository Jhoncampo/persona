import java.util.List;
import java.util.Scanner;

import models.Employe;
import models.Person;
import service.EmployeService;
import service.PersonService;

public class Main {
    public static void main(String[] args) {

        PersonService personService = new PersonService();
        EmployeService employeService = new EmployeService();
        Scanner scanner = new Scanner(System.in);


        System.out.println("What type of person do you want to add?");
        System.out.println("1. Person");
        System.out.println("2. Employe");
        int type = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case 1:
                System.out.println("Insert 5 people");
                for (int i = 1; i < 6; i++) {

                    System.out.println("Person " + i);

                    System.out.println("Add name: ");
                    String name = scanner.nextLine();

                    System.out.println("Add lastname: ");
                    String lastName = scanner.nextLine();

                    System.out.println("Add gender M/F: ");
                    char gender = scanner.next().charAt(0);
                    char genderUpperCase = Character.toUpperCase(gender);

                    System.out.println("Add age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    Person person = new Person(name, lastName, genderUpperCase, age);

                    if (person != null) {
                        personService.create(person);
                        System.out.println("This is a information person: " + person);

                    }

                }
                // Update person with id 1
                Person personToUpdate = new Person("Jhon Eduard", "Campo", 'M', 99);
                personService.update(1, personToUpdate);

                
                System.out.println("Showing all people");
                List<Person> allPeople = personService.findAll();
                for (Person person : allPeople) {
                    System.out.println(person);
                }

                System.out.println("Showing name and gender");
                List<String> result = personService.showNameAndGender();
                for (String nameAndGender : result) {
                    System.out.println(nameAndGender);
                }

                double averageAge = personService.averageAge();
                System.out.println("Average age: " + averageAge);

                int countM = personService.peopleWithGenderM();
                int countF = personService.peopleWithGenderF();
                System.out.println("People with gender M: " + countM);
                System.out.println("People with gender F: " + countF);
                break;
            case 2:
                System.out.println("Insert 5 employes");
                for (int i = 1; i < 6; i++) {

                    System.out.println("Employe " + i);

                    System.out.println("Add name: ");
                    String name = scanner.nextLine();

                    System.out.println("Add lastname: ");
                    String lastName = scanner.nextLine();

                    System.out.println("Add gender M/F: ");
                    char gender = scanner.next().charAt(0);
                    char genderUpperCase = Character.toUpperCase(gender);

                    System.out.println("Add age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Add position: ");
                    String position = scanner.nextLine();


                    Employe employe = new Employe(name, lastName, genderUpperCase, age, position);

                    if (employe != null) {
                        employeService.create(employe);
                        System.out.println("This is a information employe: " + employe);

                    }

                }

                System.out.println("Showing all employes");
                List<Employe> allEmployes = employeService.findAll();
                for (Employe employe : allEmployes) {
                    System.out.println(employe);
                }

                System.out.println("Showing name and gender");
                List<String> resultEmploye = employeService.showNameAndGender();
                for (String nameAndGender : resultEmploye) {
                    System.out.println(nameAndGender);
                }

                double averageEmployeAge = employeService.averageAge();
                System.out.println("Average age: " + averageEmployeAge);

                int countEmployesM = employeService.employesWithGenderM();
                int countEmployesF = employeService.employesWithGenderF();
                System.out.println("Employes with gender M: " + countEmployesM);
                System.out.println("Employes with gender F: " + countEmployesF);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        scanner.close();
    }
}