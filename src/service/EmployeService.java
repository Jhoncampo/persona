package service;

import java.util.LinkedList;
import java.util.List;

import models.Employe;

public class EmployeService {
    List<Employe> employes = new LinkedList<>();

    public void create(Employe employe) {
        if (employe.getGender() == 'M'|| employe.getGender() == 'F') {
            employes.add(employe);
            System.out.println("Employe added successfully");
        }else{
            throw new IllegalArgumentException("Invalid Gender");
        }
    }

    public List<Employe> findAll() {
        if (employes.isEmpty()) {
            System.out.println("There are no employes");
        }
        return employes;
    }

    public Employe findById(int id) {
        for (Employe employe : employes) {
            if (employe.getId() == id) {
                return employe;
            }
        }
        return null;
    }

    public void update(int id, Employe employe) {
        Employe existingEmploye = findById(id);
        if (existingEmploye != null) {
            existingEmploye.setName(employe.getName());
            existingEmploye.setLastName(employe.getLastName());
            existingEmploye.setGender(employe.getGender());
            existingEmploye.setAge(employe.getAge());
            existingEmploye.setPosition(employe.getPosition());
            System.out.println("Employe updated successfully");
        } else {
            System.out.println("Employe not found");
        }
    }

    public void delete(int id) {
        employes.removeIf(e -> e.getId() == id);
    }

    public List<String> showNameAndGender() {
        List<String> employeList = new LinkedList<String>();
        for (Employe employe : employes) {
            String name = employe.getName();
            char gender = employe.getGender();
            String nameAndGender = "Name: " + name + " Gender: " + gender;
            employeList.add(nameAndGender);
        }
        return employeList;
    }
       

    

    public double averageAge() {
        double sum = 0;
        for (Employe employe : employes) {
            sum = sum + employe.getAge();
        }
        return sum / employes.size();
    }

    public int employesWithGenderM() {
        int count = 0;
        for (Employe employe : employes) {
            if (employe.getGender() == 'M') {
                count++;
            }
        }
        return count;
    }

    public int employesWithGenderF() {
        int count = 0;
        for (Employe employe : employes) {
            if (employe.getGender() == 'F') {
                count++;
            }
        }
        return count;
    }

}
