public abstract class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract void printFigureName();

    public abstract void printData();

    public abstract double calculatePerimeter();
}
