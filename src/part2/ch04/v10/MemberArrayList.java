package part2.ch04.v10;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList(int size){
        arrayList = new ArrayList<Member>(size);
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int MemberId){
        for(int i =0; i<arrayList.size(); i++){
            Member member = arrayList.get(i);
            int tmpId = member.getMemberId();
            if(tmpId == MemberId){
                arrayList.remove(i);
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
