package part2.ch03;

class Book2 {
    private String title;
    private String author;

    public Book2(String title, String author){
        this.title = title;
        this.author = author;
    }
}
public class BookTest{
    public static void main(String[] args) {
        Book2 book = new Book2("책이름", "헤르만");
        System.out.println(book);
    }
}
