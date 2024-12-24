public class Car extends Toy {
    private double cabinPrice;
    private double wheelPrice;
    private int numberOfWheels;
    private double otherCosts;

    public Car(double cabinPrice, double wheelPrice, int numberOfWheels, double otherCosts) {
        this.cabinPrice = cabinPrice;
        this.wheelPrice = wheelPrice;
        this.numberOfWheels = numberOfWheels;
        this.otherCosts = otherCosts;
    }

    @Override
    public double calculatePrice() {
        return cabinPrice + (wheelPrice * numberOfWheels) + otherCosts;
    }

    @Override
    public void printDetails() {
        System.out.println("Car:");
        System.out.println("Cabin Price: " + cabinPrice);
        System.out.println("Wheel Price: " + wheelPrice);
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Other Costs: " + otherCosts);
        System.out.println("Total Price: " + calculatePrice());
    }
}
