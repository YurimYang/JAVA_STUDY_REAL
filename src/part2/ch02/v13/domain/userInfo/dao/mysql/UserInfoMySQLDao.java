package part2.ch02.v13.domain.userInfo.dao.mysql;

import part2.ch02.v13.domain.userInfo.UserInfo;
import part2.ch02.v13.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySQLDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MYSQL DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MYSQL DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from MYSQL DB userID = " + userInfo.getUserId());

    }
}
