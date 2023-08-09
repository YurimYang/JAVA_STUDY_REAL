package jdbc;

public interface JdbcConnection {
    public void getConnection(String URL, String username, String password); //db연결동작
    //getConnection을 자신의 회사에 따라 구현방식을 다르게하면 때문에
    //인터페이스로 생성하면 된다.
    //public void getMySQLConnection(); 이런식으로하면 한도끝도 없어짐
}
