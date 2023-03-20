package enums.car;

import spec.CargoSizeSpec;

public class SmallCar implements Car {

    @Override
    public CargoSizeSpec getCargoSize() {
        return CargoSizeSpec.SMALL;
    }

    @Override
    public String whoIam() {
        return "SmallCar";
    }
    
}
