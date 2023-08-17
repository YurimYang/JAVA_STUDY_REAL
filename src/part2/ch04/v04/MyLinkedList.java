package part2.ch04.v04;

public class MyLinkedList {

    private MyListNode head;
    int count;

    public MyLinkedList()
    {
        head = null;
        count = 0;
    }

    public MyListNode addElement( String data ){
        //head(LinkedList의 맨 앞부분) -> 맨 마지막 부분에 add하는 경우
        MyListNode newNode;

        if(head == null) { //맨 처음 노드일 경우
            newNode = new MyListNode(data);
            head = newNode;
        } else {
            newNode = new MyListNode(data);
            MyListNode temp = head;
            while(temp.next != null) {
                temp = temp.next; //가장 마지막 노드로 찾아들어감
            }
            temp.next = newNode; //가장 마지막 노드에 새로운 노드를 추가함

        }
        count ++; //하나가 추가됐으므로 ++;
        return newNode;
    }

    //원하는 postion의 previous node를 알아야함
    public MyListNode insertElement(int position, String data ){
        //노드들 중간에 insert되는 경우
        MyListNode tempNode = head;
        MyListNode preNode = null;
        MyListNode newNode = new MyListNode(data);

        if(position < 0 || position > count){
            return null;
        }
        //만약, 맨처음에 들어갈 경우
        if(position  == 0) {
            newNode.next = head;
            head = newNode;
        } else { //중간에 들어가는경우
            for(int i = 0; i<position; i++){
                preNode = tempNode; //head를 통해서 prevNode가 어디인지 탐색
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next; //이전 preNode가 가리켰던 노드의 위치가 new Node의 next가 됨
            preNode.next = newNode; //preNode는 이제 new Node를 가리킴
        }
        count++;
        return newNode;

    }


    public MyListNode removeElement(int position){
        MyListNode tempNode = head;
        MyListNode prevNode = null;
        if(position == 0) {
            tempNode.next = head;
        } else {
            for(int i =0; i< position; i++){
                prevNode = tempNode;
                tempNode = tempNode.next;
            }
            prevNode.next = tempNode.next;
        }
        count--;
        return tempNode;
    }

    public String getElement(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return new String("error");
        }

        if(position == 0){  //맨 인 경우

            return head.getData();
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode.getData();
    }

    public MyListNode getNode(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 인 경우

            return head;
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode;
    }

    public void removeAll()
    {
        head = null;
        count = 0;

    }

    public int getSize()
    {
        return count;
    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty()
    {
        if(head == null) return true;
        else return false;
    }

}

