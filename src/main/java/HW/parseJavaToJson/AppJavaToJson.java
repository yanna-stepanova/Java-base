package HW.parseJavaToJson;
/*
Написать программу, которая создает файл car.json из объекта
класса Car.java.
{
 "brand": "Toyota",
 "model": "Camry",
 "colors": [
 "Red"
 ],
 "maxSpeed": {
 "unit": "km/h",
 "value": 220
 },
 "engine": {
 "volume": 2.5,
 "rpm": 6600,
 "compressionRatio": "11.8:1"
 },
 "seatingCapacity": 5
 }
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AppJavaToJson {
    public static void main(String[] args) {
        File file = new File("src/main/resources/car.json");
        Map<Float, Integer> mapEngine = new HashMap<>();
        mapEngine.put(11.8f, 1);
        Car car = new Car("Toyota", "Camry", new String[]{"Red"}, 220,
                           new Engine(2.5f, 6600, mapEngine), 5);
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(parseToJSON(car));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String parseToJSON(Car carObject) {
        return "{\n \"brand\": " + "\"" + carObject.getBrand() + "\",\n" +
                " \"model\": " + "\""+carObject.getModel()+"\",\n"+
                " \"colors\": [\n\t\""+ carObject.getColors()+"\"\n ],\n"+
                " \"maxSpeed\": {\n\t\"unit\": \"km/h\",\n\t\"value\": "+carObject.getMaxSpeed()+"\n },\n" +
                " \"engine\": {\n\t\"volume\": "+carObject.getEngine().getVolume()+",\n" +
                "\t\"rpm\": "+carObject.getEngine().getRpm()+",\n" +
                "\t\"compressionRatio\": \""+carObject.getEngine().getMapCR().toString().substring(
                      carObject.getEngine().getMapCR().toString().indexOf("{")+1,
                      carObject.getEngine().getMapCR().toString().indexOf("}")).replace("=",":")+"\"\n"+
                " },\n \"seatingCapacity\": "+ carObject.getSeating()+
                "\n}";
    }
}
