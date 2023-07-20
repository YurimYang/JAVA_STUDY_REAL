package part2.ch02.v10;

public class CarTest {
    public static void main(String[] args) {
        Car AICar = new AICar();
        Car manualCar = new ManualCar();

        AICar.run();

        manualCar.run();
    }



}
