package org.example;

public class Employee {
    int employeeID;
    long phoneNumber;

    String name;

    int experience;

    public Employee(int employeeID, long phoneNumber, String name, int experience) {
        this.employeeID = employeeID;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String toString() {


        String n = "Сотрдник  номер   " + this.employeeID + " Телефон  " + this.phoneNumber + " Имя  "+  this.name + "  Стаж  "  + this.experience ;
        return n;
    }


}
