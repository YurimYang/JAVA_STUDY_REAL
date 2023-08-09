package api;

public class MyIntArray {
    private int[] arr;
    private int cnt;

    public MyIntArray(){
        //arr = new int[10]; //매개변수가 안들어간다면 기본적으로 생기는 함수 by 오버로딩
        this(10);  //MyIntArray(10)이 호출되는 것과 같은 이치
        //한번에 초기화를 시킬 수 있는 방법ㅊ
    }

    //범용성이 좋으려면 api에 매개변수를 안쓰게 하는 것이 좋다.
    public MyIntArray(int initialSize){
        arr = new int[initialSize];
    }

    // 정수를 받아서 데이터를 저장하는 동작 : add()
    public void add(int data){
        arr[cnt++] = data; //arr[0]부터 ++되면서 data가 추가됨
    }

    //arr의 사이즈
    public int size(){
        return this.cnt; //현재 들어가있는 개수
    }

    //arr에 idx별로 가져오기
    public int get(int idx){
        return arr[idx];
    }
}
