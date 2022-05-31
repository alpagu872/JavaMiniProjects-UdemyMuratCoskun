package Sol1_103_GeoShapeAreaCalc;

public class Circle extends Shape {
    private int r;

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    @Override
    void areaCalc() {
        double area = Math.PI * (r*r);
        System.out.println(getName() + " Area: " + area);
    }
}
