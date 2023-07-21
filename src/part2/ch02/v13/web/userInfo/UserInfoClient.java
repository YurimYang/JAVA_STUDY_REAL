package part2.ch02.v13.web.userInfo;

import part2.ch02.v13.domain.userInfo.UserInfo;
import part2.ch02.v13.domain.userInfo.dao.UserInfoDao;
import part2.ch02.v13.domain.userInfo.dao.mysql.UserInfoMySQLDao;
import part2.ch02.v13.domain.userInfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fls = new FileInputStream("db.properties");

        Properties prop = new Properties();
        //쌍으로 읽어들이는 기능

        prop.load(fls);
        String dbType = prop.getProperty("DBTYPE"); //DBTYPE을 알려줌

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("dkdkdk");
        userInfo.setUserName("양유림");

        UserInfoDao userInfoDao = null;

        if(dbType == "ORACLE"){
            userInfoDao = new UserInfoOracleDao();
        } else if(dbType == "MYSQL"){
            userInfoDao = new UserInfoMySQLDao();
        }else{
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
    }
}
