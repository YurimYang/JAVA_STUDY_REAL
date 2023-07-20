package part2.ch02.v09;

public abstract class Computer {
    public abstract void display();
    public abstract void typing(); //추상메서드이므로 abstract 작성

    void turnOn(){
        System.out.println("전원을 킵니다.");
    }

    void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
