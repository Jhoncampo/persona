package models;

public class Employe extends Person {
    private String position;

    public Employe(String name, String lastName, char gender, int age, String position) {
        super(name, lastName, gender, age);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", position='" + getPosition() + '\'' +
                '}';
    }

    }
