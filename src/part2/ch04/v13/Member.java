package part2.ch04.v13;

import java.util.Comparator;

public class Member implements Comparator<Member> {
    private int memberId;
    private String memberName;

    public Member(){

    }

    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }


    @Override
    public int compare(Member o1, Member o2) { //하나는 나, 하나는 비교대상
        return o1.memberId - o2.memberId;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member) obj;
            if(this.memberId == member.memberId){
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return memberId;
    }


    @Override
    public String toString(){
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }

//    @Override
//    public int compareTo(Member o) {
//        //내림차순
//        if(this.memberId < o.memberId){
//            return 1;
//        } else if (this.memberId > o.memberId){
//            return -1;
//        }
//
//        //오름차순
//        if(this.memberId > o.memberId){
//            return 1;
//        } else if (this.memberId < o.memberId){
//            return -1;
//        }
//
//        return 0;
//    }
}
