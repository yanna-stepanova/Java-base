package Lessons.lesson7;

public class Man {
    protected String name;
    protected String surname;
    private String getSurname;//??? error?

    public Man(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
