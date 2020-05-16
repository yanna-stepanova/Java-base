package Lessons.exception;

public class AppException {
    private int age;

    public static void main(String[] args) {
        AppException object = new AppException();
        object.setAge(-3);
        System.out.println(object);
    }

    public void setAge(int age) { //работает и без "throws InvalidAgeException" (в этой строке)- Потому что InvalidAgeException является наследником RuntimeException то есть является не проверяемым
        if (age < 0) {
            throw new InvalidAgeException(age);
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
