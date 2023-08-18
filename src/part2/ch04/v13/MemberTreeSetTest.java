package part2.ch04.v13;

import java.util.TreeSet;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberKim = new Member(1003, "김유신");
        Member memberLee = new Member(1001, "이순신");
        Member memberKang = new Member(1002, "강감찬");

        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKang);
        memberTreeSet.showAllMember();


//        TreeSet<String> set = new TreeSet<String>();
//        set.add("양유림");
//        set.add("다가나");
//        set.add("나주희");
//
//        System.out.println(set);
        //[나주희, 다가나, 양유림] 성의 한글순으로 출력됨


    }

}
