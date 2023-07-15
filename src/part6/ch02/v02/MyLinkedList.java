package part6.ch02.v02;

public class MyLinkedList<T> implements Ilist<T> {
    private  int size;
    private Node head;
    public MyLinkedList(){
        this.size = 0;
        this.head = new Node(null);

    }
    @Override
    public void add(T t) {
        Node curr = this.head;
        while (curr.next!= null){
            //다음에 추가할 게 존재할 때
            curr = curr.next; // 마지막 노드를 가리킴
        }
        Node node = new Node(t);
        curr.next = node; //마지막 노드에 추가함
        this.size++;
    }

    @Override
    public void insert(int index, T t) {
        Node prev = this.head;
        Node curr = prev.next;

        int i = 0;
        while(i++<index){
            prev = prev.next;
            curr = curr.next;
            //한 칸씩 이동
        }

        Node node = new Node(t, curr);
        prev.next = node;
        this.size++;

    }

    @Override
    public void clear() {
        //모두 비워주는 작업
        this.size = 0;
        this.head.next = null;
    }

    @Override
    public boolean delete(T t) {
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public boolean isEmptry() {
        return false;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    private class Node{
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
