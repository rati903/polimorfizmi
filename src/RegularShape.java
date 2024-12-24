abstract class RegularShape {
    protected int numberOfSides;
    protected double sideLength;

    public RegularShape(int numberOfSides, double sideLength) {
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
    }

    public abstract double calculatePerimeter();
}

