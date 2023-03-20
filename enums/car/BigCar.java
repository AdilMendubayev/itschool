package enums.car;

import spec.CargoSizeSpec;

public class BigCar implements Car {

    @Override
    public CargoSizeSpec getCargoSize() {
        return CargoSizeSpec.BIG;
    }

    @Override
    public String whoIam() {
        return "BigCar";
    }

    
}
