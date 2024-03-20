package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee ivan = new Employee(1, 897777783L, "Иван", 4);

        Employee misha = new Employee(2, 8983883834523L, "Михаил", 5);

        Employee sveta = new Employee(3, 893538386523L, "Светлана", 2);

        Employee alena = new Employee(4, 89353535323L, "Алена", 1);

        Employee sergei = new Employee(5, 8235622453L, "Сергей", 8);



        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmpployeeToList(ivan);
        directory.addEmpployeeToList(misha);
        directory.addEmpployeeToList(sveta);
        directory.addEmpployeeToList(alena);
        directory.addEmpployeeToList(sergei);


        System.out.println( directory);


        directory.findByExperience(1);

        directory.findPhoneByName("Сергей");


        directory.findByID(2);


    }
}