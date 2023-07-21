package part2.ch02.v13.domain.userInfo.dao.oracle;

import part2.ch02.v13.domain.userInfo.UserInfo;
import part2.ch02.v13.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into ORACLE DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into ORACLE DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from ORACLE DB userID = " + userInfo.getUserId());

    }
}