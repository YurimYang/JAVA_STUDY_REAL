package part2.ch02.v15;

public interface Buy {
    void buy();
    default void order(){
        System.out.println("buy!");
    }

}
