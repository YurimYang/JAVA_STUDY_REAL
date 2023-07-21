package part2.ch02.v15;

public interface Queue {
    void enQueue(String title);
    String deQueue();

    int getSize();
}
