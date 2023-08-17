package part2.ch04.v06;

import part2.ch04.v04.MyLinkedList;
import part2.ch04.v04.MyListNode;

interface MyListQueue {
    public void enQueue(String data);
    public String deQueue();
    public void printAll();
}

public class MyLinkedQueue extends MyLinkedList implements MyListQueue {

    MyListNode front;
    MyListNode rear;

    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if(isEmpty()){
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        } else {
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() + "added");
    }

    @Override
    public String deQueue() {
        if(isEmpty()){
            return null;
        }
        String data = front.getData();
        front = front.next;
        if(front.next == null){
            rear = null;
        }
        return null;
    }

    @Override
    public void printAll() {

    }
}




