package part2.ch04.v05;


import part2.ch04.v03.MyArray;

public class MyArrayStack {

    MyArray arrStk;
    int top;

    public MyArrayStack(){
        top = 0;
        arrStk = new MyArray();
    }

    public MyArrayStack(int size){
        arrStk = new MyArray(size);
    }

    public void push (int data){
        if(isFull()) {
            System.out.println("stk is full");
            return;
        } else {
            arrStk.addElement(data);
            top++;
        }
    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("stk is empty");
            return MyArray.ERROR_NUM;
        }
        return arrStk.removeElement(--top);
    }

    public int peek(){
        if(isEmpty()) {
            System.out.println("stk is empty");
            return MyArray.ERROR_NUM;
        } else {
            return arrStk.getElement(top-1);
        }
    }

    public boolean isFull(){
        if(top == arrStk.ARRAY_SIZE){
            return true;
        } else {
             return false;
        }
    }
    public boolean isEmpty(){
        if(top == 0){
            return true;
        } else {
            return false;
        }
    }


    public void printAll(){
        arrStk.printAll();
    }
}






