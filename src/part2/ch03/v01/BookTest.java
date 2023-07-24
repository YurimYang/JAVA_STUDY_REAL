package part2.ch03.v01;

class Book2 {
    private String title;

    @Override
    public String toString() {
        return title + "," + author;
    }

    private String author;

    public Book2(String title, String author){
        this.title = title;
        this.author = author;
    }
}
public class BookTest{
    public static void main(String[] args) {
        Book2 book = new Book2("책이름", "헤르만");
        System.out.println(book); //인스턴스 메모리의 가상위치값(jvm)
        //단, 기본값 toString을 overriding 한 이후에는 다름
        System.out.println(book.toString()); //toString은 디폴트로 들어감

        String str = new String("test");
        System.out.println(str); //문자열 값 그대로 나옴
        // => str.toString이 오버라이딩 되어있기 때문!
    }
}
