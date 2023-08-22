package part2.ch05.v04;


public class StringConcatImpl implements StringConcat{

    @Override
    public void makeString(String s1, String s2) {
        System.out.println(s1 + "," + s2);
    }
}
