import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Component> componentsA = new ArrayList<>();
        ArrayList<Component> componentsB = new ArrayList<>();
        ArrayList<Component> componentsC = new ArrayList<>();

        componentsA.add(new Component("AC",1499.99,"klima"));
        componentsA.add(new Component("Automatic gearbox",3999.99,"automatyczna skrzynka"));
        componentsB.add(new Component("123",123.123,"123"));

        CarFactory factory = new CarFactory();
        Car car1 = factory.prepareCar(CarModel.modelA,componentsA,new Engine(EngineType.DIESEL,EngineCapacity.A));
        Car car2 = factory.prepareCar(CarModel.modelB,componentsB,new Engine(EngineType.GAS,EngineCapacity.D));
        Car car3 = factory.prepareCar(CarModel.modelB,componentsC,new Engine(EngineType.GAS,EngineCapacity.A));

        System.out.println(factory.prepareOffer(car1));
        System.out.println(factory.prepareOffer(car2));
        System.out.println(factory.prepareOffer(car3));
    }
}
