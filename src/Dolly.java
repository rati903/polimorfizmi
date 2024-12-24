public class Dolly extends Toy {
    private double clothesPrice;
    private double hairMaterialCost;
    private double otherCosts;

    public Dolly(double clothesPrice, double hairMaterialCost, double otherCosts) {
        this.clothesPrice = clothesPrice;
        this.hairMaterialCost = hairMaterialCost;
        this.otherCosts = otherCosts;
    }

    @Override
    public double calculatePrice() {
        return clothesPrice + hairMaterialCost + otherCosts;
    }

    @Override
    public void printDetails() {
        System.out.println("Dolly:");
        System.out.println("Clothes Price: " + clothesPrice);
        System.out.println("Hair Material Cost: " + hairMaterialCost);
        System.out.println("Other Costs: " + otherCosts);
        System.out.println("Total Price: " + calculatePrice());
    }
}
