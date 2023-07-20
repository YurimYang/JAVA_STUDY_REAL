package part2.ch02.v10;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }
    final public void run(){ //하위클래스에서 해당 메서드 변경 불가
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
