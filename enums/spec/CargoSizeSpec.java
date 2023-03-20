package spec;

public enum CargoSizeSpec {
    SMALL(10),
    MEDIUM(40),
    BIG(90);

    private int weight;

    private CargoSizeSpec(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
