package part2.ch02.v15;

public interface Sell {
    void sell();
    default void order(){
        System.out.println("sell!");
    }
}
