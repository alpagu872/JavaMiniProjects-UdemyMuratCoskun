package Sol1_103_GeoShapeAreaCalc;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void areaCalc() {
        double u = (a + b + c) / 2;
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println(getName() + " Area : " + area);
    }
}
