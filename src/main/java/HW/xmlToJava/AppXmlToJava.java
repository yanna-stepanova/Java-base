package HW.xmlToJava;

/*
Написать программу, которая считывает файл car.xml и создает на его
основе объект класса Car.java.
 */

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppXmlToJava {
    private static final String COLOR = "<color>";
    private static final String SEATING = "<seating-capacity ";
    private static final String SPEED = "<max-speed";
    private static final String VOLUME = "<volume";
    private static final String RPM = "<rpm>";
    private static final String ENGINE_CR = "<compression-ratio>";

    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(new FileReader("src/main/resources/car.xml"))) {
            Car car = new Car();
            Engine engine = new Engine();
            while (scan.hasNextLine()) {
                String line = scan.nextLine().trim();
                if (!line.startsWith("<!")) {
                    parser(line, car, engine);
                }
            }
            System.out.println(car);
        }
    }

    public static void parser(String line, Car object, Engine engObject) {
        if (line.startsWith("<car")) {
            String[] words = line.substring((line.indexOf("<car") + 4), (line.indexOf(">"))).split(" ");
            Map<String, String> map = new HashMap<>();
            for (String word : words) {
                if (!word.equals(" ")) {
                    String[] items = word.split("=");
                    if (items.length == 2) {
                        map.put(items[0], items[1].substring((items[1].indexOf("\"") + 1), items[1].lastIndexOf("\"")));
                    }
                }
            }
            object.setBrand(map.get("brand"));
            object.setModel(map.get("model"));
        }

        if (line.startsWith(COLOR)) {
            object.setColor(line.substring(line.indexOf(COLOR) + COLOR.length(), line.indexOf("</")));
        }

        if (line.startsWith(SEATING)) {
            String[] seat = line.substring((line.indexOf(SEATING) + SEATING.length()), (line.indexOf("/>"))).split("=");

            object.setSeating(Integer.parseInt(seat[1].substring(
                    (seat[1].indexOf("\"") + 1),
                    seat[1].lastIndexOf("\""))));
        }

        if(line.startsWith(SPEED)){
            object.setMaxSpeed( Integer.parseInt(line.substring((line.indexOf(">")+1), line.indexOf("</"))));
        }

        if(line.startsWith(VOLUME)){
            engObject.setVolume(Float.parseFloat(line.substring((line.indexOf(">")+1), line.indexOf("</"))));
        }

        if (line.startsWith(RPM)){
            engObject.setRpm(Long.parseLong(
                    line.substring((line.indexOf(">")+1), line.indexOf("</"))
            ));
        }

        if(line.startsWith(ENGINE_CR)){
            String[] engineCR = line.substring((line.indexOf(">")+1), line.indexOf("</")).split(":");
            Map<Float,Integer> mapEngine = new HashMap<>();
            mapEngine.put(Float.parseFloat(engineCR[0]), Integer.parseInt(engineCR[1]));
            engObject.setMapCR(mapEngine);
        }

        if(engObject != null){
            object.setEngine(engObject);
        }



    }


}
