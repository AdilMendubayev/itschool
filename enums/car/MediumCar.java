package enums.car;
import spec.CargoSizeSpec;
public class MediumCar implements Car{

    @Override
    public CargoSizeSpec getCargoSize() {
        return CargoSizeSpec.MEDIUM;
    }

    @Override
    public String whoIam() {
        return "MediumCar";
    }
    
}
