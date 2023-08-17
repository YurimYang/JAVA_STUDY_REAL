package part2.ch04.v12;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet(4);

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1003, "홍길동");
        //└ 1003번이 중복되더라도 지워지지 않은 이유는 equals, hashCode에 대한
        //  override를 해서 직접 지정해주지 않았기 때문임 !! 자동으로 되는건 아님
        // override해서 지정을 해주고 run을 하면 아예 들어가지 않게 된다

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberKang);
        memberHashSet.addMember(memberHong);

        memberHashSet.showAllMember();
//
//        memberHashSet.removeMember(memberHong.getMemberId());
//        memberHashSet.showAllMember();
    }

}
