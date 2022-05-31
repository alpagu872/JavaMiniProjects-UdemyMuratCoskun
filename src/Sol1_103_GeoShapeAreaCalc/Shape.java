package Sol1_103_GeoShapeAreaCalc;

public abstract class Shape {
    public Shape(String name) {
        this.name = name;
    }

    private String name;
    abstract void areaCalc();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
