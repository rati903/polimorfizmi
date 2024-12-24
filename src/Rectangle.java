public class Rectangle extends Shape {


    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void printFigureName() {
        System.out.println("Rectangle");
    }

    @Override
    public void printData() {
        System.out.println("Width: " + x + ", Height: " + y);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (x + y);
    }
}
