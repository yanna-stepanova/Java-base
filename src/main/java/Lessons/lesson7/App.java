package Lessons.lesson7;

import java.text.ParseException;

public class App {
    public static void main(String[] args) throws ParseException {
        Employee emp1 = new Employee("Employee1", "First", "Position1");
        System.out.println("Name: " + emp1.getName() + " " + emp1.getSurname() + ", position: " + emp1.getPosition());
        emp1.setCard(new IdCard(13));
        emp1.setRoom(new Room(100));
        emp1.setDepartment(new Department("depart1"));
        emp1.setPastPositions(new PastPosition("pos0", new Department("depart0")));
        System.out.println("Name: " + emp1.getName() + " " + emp1.getSurname() + ", position: " + emp1.getPosition()
                + ", idCard= " + emp1.getCard().getNumber() + ", department: " + emp1.getDepartment().getName()
                + ", room: " + emp1.getRooms() + ", pastPosition: " + emp1.getPastPositions()); //? output array, not one object

       /*
        ArrayList<Employee> people = new ArrayList<Employee>();

        people.add(new Employee("Employee1","First","Position1"));
        people.add(new Employee("Employee2", "Second", "Position2"));
        people.add(new Employee("Employee3", "Third", "Position3"));
        int i = 0, j=100;
        for (Employee ob : people){
            ob.setCard(new IdCard(++i));
            ob.setRoom(new Room(j++));
            ob.setDepartment(new Department("depart_"+i+j));
        }
        System.out.println("List of employees: ");
        for (Employee object : people){
            System.out.println(object.getName()+" "+object.getSurname()+" "+object.getPosition()+" "
                    +object.getCard().getNumber()+" "+object.getRooms()+" "
                    +object.getDepartment().getName()+" "+object.getPastPositions());
        }

        for (Employee ob : people){
            if (ob.getRooms().equals(100)){
              //  ob.deleteRoom();//???
            }
        }
        System.out.println("\nAfter deletion the room '100': ");
        for (Employee object : people){
            System.out.println(object.getName()+" "+object.getSurname()+" "+object.getPosition()+" "
                    +object.getCard().getNumber()+" "+object.getRooms()+" "
                    +object.getDepartment().getName()+" "+object.getPastPositions());
        }

        Department department = new Department("depart_1101");
        department.addEmployee(new Employee("Peter","Petrov", "developer"));

        for (Employee obj : people){
            if (obj.getDepartment().getName().equals(department.getName())){
                department.addEmployee(obj);
            }

        }
        System.out.println("\nList of employees in department: "+"'"+department.getName()+ "'");
        for(Employee em: department.getEmployees()){
            System.out.println(department.getName()+" "+em.getName()+" "+em.getSurname()+" "+em.getPosition());

        }


        */
    }

}
