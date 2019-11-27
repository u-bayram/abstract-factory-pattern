package abstractfactory.samples;

/**
 * @author umut.bayram
 */
public class ConcreteVehicleFactoryImpl1 implements VehicleFactory {
    public Bike getBike() {
        return new RoadBike();
    }

    public Car getCar() {
        return new SportCar();
    }

}
