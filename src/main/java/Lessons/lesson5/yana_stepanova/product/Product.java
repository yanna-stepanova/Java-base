package Lessons.lesson5.yana_stepanova.product;

public abstract class Product {
    private String brand;
    private String model;
    private String category;
    private double price;
    private long id;

    public abstract String getInfo();

    public Product(long id) {
        this.id = id;
    }

    public Product(String brand, long id) {
        this.brand = brand;
        this.id = id;
    }

    public Product(String brand, String category, long id) {
        this.brand = brand;
        this.category = category;
        this.id = id;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    }
