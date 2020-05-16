package Lessons.lesson7;

public class PastPosition {
    private String name;
    private Department department;

    public PastPosition(String position, Department dep) {
        this.name = position;
        this.department = dep;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(Department d) {
        this.department = d;
    }

    public Department getDepartment() {
        return department;
    }

}
