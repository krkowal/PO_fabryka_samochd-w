public class Component {
    public String name;
    public double price;
    public String description;

    public Component(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
}

