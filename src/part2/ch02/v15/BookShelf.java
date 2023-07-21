package part2.ch02.v15;

public class BookShelf extends Shelf implements Queue{
    //Shelf란 클래스 상속(extends) & Queue란 인터페이스 상속(implements)
    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
