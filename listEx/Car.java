import java.util.Objects;

public class Car {

    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.model, this.color);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Car)) {
            return false;
        }

        Car other = (Car) obj;
        return this.model.equals(other.model)
                && this.color.equals(other.color); 
    }
}
