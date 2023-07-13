package part2.ch01.v18;

public class Company {

    //외부에서는 Company의 default 생성자(public)을 무한으로 만들 수 있게됨
    //이를 막기 위해 single-ton 체계를 만들어야함!

    //그렇기 때문에 생성자를 아예 private으로 만들기
    private static Company instace = new Company(); // Company로 만들 유일한 객체

    private Company() {
    }

    //일반 getter와 달리 static으로 작성
    //company란 인스턴스를 생성하고 쓸 수 있기 때문 !!
    public static Company getInstace(){
        if (instace == null){
            instace = new Company();
        }
        return instace;
    }
}
