package javaBasic;

import jdbc.JdbcConnection;
import jdbc.MySQLConnection;
import jdbc.OracleConnection;

public class FC22 {
    public static void main(String[] args) {
        JdbcConnection oracleConn = new OracleConnection();
        oracleConn.getConnection("URL", "system", "manager");

        JdbcConnection mysqlConn = new MySQLConnection();
        mysqlConn.getConnection("URL", "root", "manager");
    }
}
