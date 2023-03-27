import java.util.Scanner;

import car.MediumCar;
import car.SmallCar;
import car.BigCar;
import spec.CargoSizeSpec;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var cargoSizeStr = sc.next();

        var cargoSize = CargoSizeSpec.valueOf(cargoSizeStr);

        Car car = null;
        switch (cargoSize) {
            case SMALL:
                car = new SmallCar();
                break;
            case MEDIUM:
                car = new MediumCar();
                break;
            case BIG:
                car = new BigCar();
                break;
            default:
                System.out.println("I don't know that cargo size");
                break;
        }

        if (car != null) {
            System.out.printf(
                    "I'm a %s and I can move %d kilograms",
                    car.whoIam(),
                    car.getCargoSize().getWeight());
        }

    }
}
