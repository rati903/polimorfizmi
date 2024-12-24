public class Triangle2 extends Shape {
    private double z;


    public Triangle2(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void printFigureName() {
        System.out.println("Triangle");
    }

    @Override
    public void printData() {
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }

    @Override
    public double calculatePerimeter() {
        return x + y + z;
    }
}
