package Lessons.lesson7;

import java.util.Arrays;

public class Department implements Unit {
    private String name;
    private Employee[] employees; //заранее не знаем размер массива ссылок на объект,
    // a ArrayList имеет произвольную длинну


    @Override
    public int getPersonCount() {
        int counter = 0;
        if (employees == null){
            return counter;
        }
        for (Employee value: employees){
            if(value!=null){
                counter++;
            }
        }
        return employees.length;
    }

    public Department(String n) {
        this.name = n;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setEmployees(Employee employee) {
        if (employees == null) {
            employees = new Employee[10];
        }

        boolean isEmployeeAdded = false;

        for (Employee value : employees) {
            if (value.equals(employee)) {
                return;
            }
        }

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                isEmployeeAdded = true;
                break;
            }
        }

        if (!isEmployeeAdded) {
            employees = Arrays.copyOf(employees, employees.length + (employees.length >> 1));
        }

    }

    public void addEmployee(Employee newEmployee) {
        if (employees == null) {
            employees = new Employee[10];
        }

        boolean isEmployeeAdded = false;

        for (Employee value : employees) {
            if(value!=null) {
                if (value.equals(newEmployee)) {
                    return;
                }
            }
        }

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                employees[i].setDepartment(this);
                isEmployeeAdded = true;
                break;
            }
        }

        if (!isEmployeeAdded) {
            employees = Arrays.copyOf(employees, employees.length + (employees.length >> 1));
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void removeEmployee(Employee employee) {
        if (employees == null){
            return;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(employee)){
                employees[i] = null;
            }
        }



    }
}
