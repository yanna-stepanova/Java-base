/*
Задание Task_04 из лекции 04_String.
Дано:   String name = "Myname";
        String birthDay = "10/12/1999";
        String gender = "Male";
        String profession = "Developer";
        String info = generateInfo(name, birthDay, gender, profession);
Ожидаемый результат:
INFO
Name: MyName;
Birthday: 10_12_1990;
Gender: Male;
Profession: Developer.
*/
package HW.hw3;
public class hw3Task4_String {
    public static void main(String[] args) {
        String name = "MyName";
        String birthDay = "10/12/1999";
        String gender = "Male";
        String profession = "Developer";
        String info = generateInfo(name, birthDay, gender, profession);
        System.out.print(info);
    }

    static String generateInfo(String name, String birthDay, String gender, String profession) {
        StringBuilder str = new StringBuilder();
        str.append("INFO\n").append("Name:\t").append(name).append(";\n");
        str.append("Birthday:\t").append(birthDay.replace("/","_")).append(";\n");
        str.append("Gender:\t").append(gender).append(";\n");
        str.append("Profession:\t").append(profession).append(".\n");
        return str.toString();
    }


}
