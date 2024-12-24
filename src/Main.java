public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        Triangle triangle = new Triangle(3);
        System.out.println("Perimeter of Square: " + square.calculatePerimeter());
        System.out.println("Perimeter of  Triangle: " + triangle.calculatePerimeter());

        Shape triangle2 = new Triangle2(3, 4, 5);
        triangle2.printFigureName();
        triangle2.printData();
        System.out.println("Perimeter: " + triangle2.calculatePerimeter());

        Shape rectangle = new Rectangle(5, 7);
        rectangle.printFigureName();
        rectangle.printData();
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        Dolly dolly = new Dolly(15.5, 10.0, 5.0);
        dolly.calculatePrice();
        dolly.printDetails();



        Car car = new Car(30.0, 5.0, 4, 8.0);
        car.calculatePrice();
        car.printDetails();

        FixedSalaryEmployee fixedEmployee = new FixedSalaryEmployee("Rati", "Raiani", "1121", 5000);
        System.out.println("Fixed Salary Employee Details:");
        fixedEmployee.calculateSalary();
        fixedEmployee.printDetails();
        System.out.println();


        DailyPaidEmployee dailyEmployee = new DailyPaidEmployee("Dachi", "Kashakashvili", "2024", 30, 200);
        System.out.println("Daily Paid Employee Details:");
        dailyEmployee.calculateSalary();
        dailyEmployee.printDetails();

        Car1 car1 = new Car1();


        car1.start();
        car1.left();
        car1.right();
        car1.stop();
    }
}
