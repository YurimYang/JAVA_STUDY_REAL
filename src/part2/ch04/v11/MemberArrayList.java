package part2.ch04.v11;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList(int size){
        arrayList = new ArrayList<Member>(size);
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int MemberId){
        Iterator<Member> it = arrayList.iterator();
        while(it.hasNext()){
            Member member = it.next();
            int tempId = member.getMemberId();
            if(tempId == MemberId){
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(MemberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        /*
        for(Member member : arrayList){
			System.out.println(member);
		}
         */
    }


}
