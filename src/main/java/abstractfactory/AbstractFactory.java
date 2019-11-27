package abstractfactory;

import abstractfactory.samples.ConcreteVehicleFactoryImpl1;
import abstractfactory.samples.ConcreteVehicleFactoryImpl2;
import abstractfactory.samples.VehicleFactory;

/**
 * @author umut.bayram
 */
public class AbstractFactory {


    public static void main(String args[]) {
        VehicleFactory vehicleFactory1 = new ConcreteVehicleFactoryImpl1();
        System.out.println(vehicleFactory1.getBike().getType());
        System.out.println(vehicleFactory1.getCar().getType());

        VehicleFactory vehicleFactory2 = new ConcreteVehicleFactoryImpl2();
        System.out.println(vehicleFactory2.getBike().getType());
        System.out.println(vehicleFactory2.getCar().getType());
    }

}
