package Lessons.lesson2;

public class Task2 {
    public static void main(String[] args) {
        String day = "Thu";
        switch(day){
            case "Mon":
            case "Tue":
            case "Wen":
            case "Thu": System.out.println("Time to work");
                    break;
            case "Fri": System.out.println("Nearing weekend");
                    break;
            case "Sat":
            case "Sun": System.out.println("Weekend");
                    break;
            default: System.out.println("Invalid day?");
        }

    }
}
