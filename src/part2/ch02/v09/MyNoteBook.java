package part2.ch02.v09;

public class MyNoteBook extends NoteBook{
    //NoteBook에서 구현하지 않았던 typing을 구현하라고 나옴!
    @Override
    public void typing() {
        System.out.println("MyNoteBook typing");
    }
}
