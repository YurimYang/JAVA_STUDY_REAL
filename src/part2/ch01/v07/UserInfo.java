package part2.ch01.v07;

public class UserInfo {

    public String userId;
    public String userPW;
    public String userName;
    public String userAddress;
    public String phoneNumber;

    public UserInfo(String userId, String userPW, String userName){
        this.userId = userId;
        this.userPW = userPW;
        this.userName = userName;
    }

    public String showUserInfo() {
        return "고객님의 아이디는 " + userId + "등록된 이름은 " + userName + "입니다.";
    }
}
