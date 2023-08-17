package part2.ch04.v12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet(int size){
        hashSet = new HashSet<>(size);
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean removeMember(int MemberId){
        Iterator<Member> it = hashSet.iterator();
        while(it.hasNext()){
            Member member = it.next();
            int tempId = member.getMemberId();
            if(tempId == MemberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(MemberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member member : hashSet) {
            System.out.println(member);
        }
    }
}
