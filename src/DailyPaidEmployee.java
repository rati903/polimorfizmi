public class DailyPaidEmployee extends Employee {
    private int numberOfDaysWorked;
    private double dailyRate;

    public DailyPaidEmployee(String firstName, String lastName, String phoneNumber, int numberOfDaysWorked, double dailyRate) {
        super(firstName, lastName, phoneNumber);
        this.numberOfDaysWorked = numberOfDaysWorked;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateSalary() {
        return numberOfDaysWorked * dailyRate;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Days Worked: " + numberOfDaysWorked);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
