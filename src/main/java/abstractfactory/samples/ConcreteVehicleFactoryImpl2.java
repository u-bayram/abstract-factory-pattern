package abstractfactory.samples;

/**
 * @author umut.bayram
 */
public class ConcreteVehicleFactoryImpl2 implements VehicleFactory {
    public Bike getBike() {
        return new RoadBike();
    }

    public Car getCar() {
        return new JeepCar();
    }
}
