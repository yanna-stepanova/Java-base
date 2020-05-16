package Lessons.lesson3;

public class Tack4 {
    public static void main(String[] args) {
        String firstName = "vasya";
        String lastName = "petrenko";
        String fullName = getFullName(firstName, lastName);
        String id = generateId(firstName, lastName);
        System.out.println(fullName);
        System.out.println(id);
        System.out.println(ifContainsNumber(id));
    }

    static boolean ifContainsNumber(String str)
    {
        for (int i = 0; i <10; i++)
        {
            String index = String.valueOf(i);
            if (str.contains(index) == true)
                return true;


        }
        return false;
    }

    static String getFullName(String fn, String ln) {
        return fn.concat(" "+ ln).toUpperCase();

    }
    static String generateId(String f, String l){
        String all = f.concat("_"+ l).toUpperCase();
        int sum = f.length()+l.length();
        return all.concat("_"+sum);
    }


}