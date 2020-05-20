package HW.xmlToJava;

import java.util.HashMap;
import java.util.Map;

public class Engine {
    private float volume;
    private long rpm;
    Map<Float,Integer> mapCR=new HashMap<>();

    public Engine(Engine engine) {
        this(engine.getVolume(),engine.getRpm(),engine.getMapCR());
    }

    public Engine(float volume, long rpm, Map<Float, Integer> mapCR) {
        this.volume= volume;
        this.rpm = rpm;
        this.mapCR=mapCR;
    }

    public Engine() {
    }

    @Override
    public String toString() {
        return "Engine{ " +
                "volume=" + volume +
                ", rpm=" + rpm +
                ", mapCR=" + mapCR.entrySet() +
                '}';
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public long getRpm() {
        return rpm;
    }

    public void setRpm(long rpm) {
        this.rpm = rpm;
    }

    public Map<Float, Integer> getMapCR() {
        return mapCR;
    }

    public void setMapCR(Map<Float, Integer> mapCR) {
        this.mapCR = mapCR;
    }



}
