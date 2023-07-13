package part2.ch01.v19;

public class Car {
    public static int CarNum = 10000;
    private int carId;


    public int getCarNum() {
        CarNum ++;
        carId = CarNum;
        return carId;
    }



}
