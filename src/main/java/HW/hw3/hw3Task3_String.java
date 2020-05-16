/*
Задание Task_03 из лекции 04_String:
String id = "UX-45528-AB";
int number = extractNumberFrom(id); // ожидается 45528
String newId = replaceDashes(id);  // ожидается UX_45528_AB
 */
package HW.hw3;
public class hw3Task3_String {
    public static void main(String[] args) {
        String id = "UX-45528-AB";
        int number = extractNumberFrom(id); // ожидается 45528
        String newId = replaceDashes(id);  // ожидается UX_45528_AB
        System.out.println("Number = " + number);
        System.out.println("New ID = " + newId);
    }

    static String replaceDashes(String str) {
        String newStr = str.replace("-", "_");
        return newStr;
    }


    static int extractNumberFrom(String str) {
        char[] ch = str.toCharArray();
        StringBuilder findNumber = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
           if( Character.isDigit(ch[i]) ) {
               findNumber.append(ch[i]);
           }
        }
        int num = Integer.parseInt(findNumber.toString());
        return num;
    }
/*
    //или можно еще так - это был 1й вариант
    static int extractNumberFrom(String str) {
        char[] arrayInt = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; //если записать цифры без одинар.кавычек, работать не будет!!!
        char[] ch = str.toCharArray();
        StringBuilder findNumber = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < arrayInt.length; j++) {
                if (ch[i] == arrayInt[j]) {
                    findNumber.append(ch[i]);
                }
            }
        }
        int num = Integer.parseInt(findNumber.toString());
        return num;
    }
*/

}
