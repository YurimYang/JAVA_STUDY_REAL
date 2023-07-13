package part2.ch01.v08;

public class UserTest {

    public static void main(String[] args){

        User user1 = new User();

        user1.height = 180;
        user1.weight = 78;
        user1.name = "Tomas";
        user1.age = 37;

        System.out.println(user1.ShowUserInfo());

    }
}
