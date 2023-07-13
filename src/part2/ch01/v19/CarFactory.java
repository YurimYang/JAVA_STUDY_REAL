package part2.ch01.v19;

public class CarFactory {
    private static CarFactory instance;

    public static CarFactory getInstance() {
        if (instance == null){
            instance = new CarFactory();
        }
        return instance;
    }


    public Car createCar(){
        Car car = new Car();
        return car;
    }







}
