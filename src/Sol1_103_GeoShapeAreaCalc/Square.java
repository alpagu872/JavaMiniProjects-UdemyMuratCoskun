package Sol1_103_GeoShapeAreaCalc;

public class Square extends Shape {
    private int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    void areaCalc() {
        double area = a*a;
        System.out.println(getName() + " Area : " + area);
    }
}
