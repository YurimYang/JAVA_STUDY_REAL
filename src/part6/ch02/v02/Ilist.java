package part6.ch02.v02;


public interface Ilist<T> {

    void add(T t);
    void insert(int index, T t);
    void clear();
    boolean delete(T t);
    boolean deleteByIndex(int index);
    T get(int index);
    int indexOf(T t);
    boolean isEmptry();
    boolean contains(T t);
    int size();


}
