import java.text.DecimalFormat;
import java.util.ArrayList;


public class CarFactory {
    public String prepareOffer(Car car){
        DecimalFormat df = new DecimalFormat("#.00");
        return String.valueOf(df.format(car.generatePrice(car.components,car.model)));
    }
    public Car prepareCar (CarModel model, ArrayList<Component> components,Engine engine){
        return new Car(model,components,engine);
    }

}
