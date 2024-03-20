package org.example;

import java.util.ArrayList;
import java.util.List;


public class EmployeeDirectory {

    List<Employee> employeeList;


    public EmployeeDirectory() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmpployeeToList(Employee employee){
        this.employeeList.add(employee);

    }

    @Override
    public String toString() {
        for (Employee e:this.employeeList)
        {
            System.out.println( e);
        }

        String n =  "";
        return n;
    }

    public  List<Employee> findByExperience(int Experince){

        List<Employee>  experinceList = new ArrayList<>();

        for (Employee e:this.employeeList)
        {
            if( e.getExperience()==Experince){
                experinceList.add(e);

            }

        }
        System.out.println(  "Результаты поиска сотрудника по стажу   ");

        System.out.println(  experinceList);
        return experinceList;

    }


    public  List<Long> findPhoneByName(String name){

        List<Long>  phoneList = new ArrayList<>();

        for (Employee e:this.employeeList)
        {
            if( e.getName()==name){
                phoneList.add(e.getPhoneNumber());

            }

        }
        System.out.println(  "Результаты поиска телефона по имени   ");

        System.out.println(  phoneList);
        return phoneList;

    }


    public  List<Employee> findByID(int id){

        List<Employee>  idList = new ArrayList<>();

        for (Employee e:this.employeeList)
        {
            if( e.getExperience()==id){
                idList.add(e);

            }

        }
        System.out.println(  "Результаты поиска сотрудника по ID   ");

        System.out.println(  idList);
        return idList;

    }

}
