package models;

public class Person {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String lastName;
    private char gender;
    private int age;

    public Person(String name, String lastName, char gender, int age) {
        this.id = idCounter++;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {

            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid gender");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: {" +
                " Id='" + id + '\'' +
                " Name='" + name + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Gender='" + gender + '\'' +
                ", Age=" + age +
                " }";

    }
}
