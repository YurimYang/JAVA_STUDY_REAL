package part2.ch01.v08;

public class User {
    public int height;
    public int weight;
    public String name;
    public int age;

    public String ShowUserInfo(){
        return "키가" + height + "이고, 몸무게가 " + weight + "킬로인 남성이 있습니다." +
                "이름은 " + name + "이고, 나이는" + age + "세입니다.";

    }

}
