package Lessons.lesson5.yana_stepanova.user;

public class User {

    private String name;
    private String lastName;
    private String log;
    private String password;
    private String email;

    public void info(){
        System.out.println("Name: " + getName()+"\nLast name: "+getLastName()+"\nEmail: "+ getEmail()+
                "\nLog: "+ getLog());
    }

    public User(){

    }

    public User(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public User(User user){
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getLog() {
        return log;
    }
    public String getName() {
        return name;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
