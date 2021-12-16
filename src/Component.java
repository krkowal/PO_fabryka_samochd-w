public class Component {
    public String name;
    public float price;
    public String description;

    public Component(String name, float price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public float getPrice() {
        return price;
    }
}

