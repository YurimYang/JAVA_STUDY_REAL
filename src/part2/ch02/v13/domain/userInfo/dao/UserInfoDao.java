package part2.ch02.v13.domain.userInfo.dao;

import part2.ch02.v13.domain.userInfo.UserInfo;

public interface UserInfoDao {
    //User에 구현해야되는것들
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
