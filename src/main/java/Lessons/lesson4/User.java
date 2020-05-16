package Lessons.lesson4;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private long id;

    public String getFN (){
        System.out.println("Get first name");
        return firstName;
    }

    public String getLN (){
        System.out.println("Get last name");
        return lastName;
    }

    public String getE (){
        System.out.println("Get email");
        return email;
    }

    public int getA(){
        System.out.println("Get age");
        return age;
    }

    public long getId(){
        System.out.println("Get id");
        return id;
    }

    public void setFN (String firstName){
        if (firstName.length()>0) {
            this.firstName = firstName;
        }
    }
    public void setLN (String lastName){
        if(lastName.length()>0){
            this.lastName = lastName;
        }

    }

    public void setE (String email){
        if (email.contains("@")) {
            this.email = email;
        }
    }

    public void setA( int age){
        if (age >0 && age < 100) {
            this.age = age;
        }
    }

    public void setId( long id){
        if (id > 0) {
            this.id = id;
        }
    }
}

