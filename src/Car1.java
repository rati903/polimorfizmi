public class Car1 implements StarStop, LeftRight {

    @Override
    public void start() {
        System.out.println("The car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping.");
    }

    @Override
    public void left() {
        System.out.println("The car is turning left.");
    }

    @Override
    public void right() {
        System.out.println("The car is turning right.");
    }
}

