package part2.ch02.v09;

public abstract class NoteBook extends Computer{
    @Override
    public void display() {
        System.out.println("NoteBook Display");
    }
    //만약, typing을 override하지 않는다면, abstract를 추가해줘야한다.
}
