package part2.ch02.v09;

public class Desktop extends Computer{
    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }
}
