import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    public CarModel model;
    public ArrayList<Component> components;
    public Engine engine;

    public Car(CarModel model, ArrayList<Component> components, Engine engine) {
        this.model = model;
        this.components = components;
        this.engine = engine;
    }

    public float generatePrice(ArrayList<Component> components){
        float sum = 0;
        for (Component c : components){
            sum+=c.getPrice();
        }
        return sum;
    }
}
