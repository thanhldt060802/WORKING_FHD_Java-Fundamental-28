public class Computer {

    private String id;
    private String name;
    private String brand;
    private String os;
    private double price;
    
    public Computer(String id, String name, String brand, String os, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.os = os;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer [id=" + id + ", name=" + name + ", brand=" + brand + ", os=" + os + ", price=" + price + "]";
    }
    
}
