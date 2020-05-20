package HW.parseJavaToJson;

public class Car {
    private String brand;
    private String model;
    private String[] colors;
    private int maxSpeed;
    private Engine engine;
    private int seating;

    public Car(String brand, String model, String[] colors, int maxSpeed, Engine engine, int seating) {
        this.brand = brand;
        this.model = model;
        this.colors = colors;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.seating = seating;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{\n" +
                "\tbrand='" + brand + '\'' +"\n"+
                "\t, model='" + model + '\'' +"\n"+
                "\t, colors=[\'" + getColors() + "\']" +"\n"+
                "\t, maxSpeed=" + maxSpeed +"\n"+
                "\t, engine=" + engine +"\n"+
                "\t, seating=" + seating +"\n"+
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColors() {
        String strColors="";
        for(String str: colors){
            strColors = strColors.concat(str);
        }
        return strColors;
    }

    public void setColor(String[] color) {
        this.colors = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = new Engine(engine);
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }
}
