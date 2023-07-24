package part2.ch01.v21;

public class ObjectCopyTest2 {

    public static void main(String[] args) {

        Book[] library2 = new Book[5];
        Book[] copyLibrary = new Book[5];

        library2[0] = new Book("태백산맥1", "조정래");
        library2[1] = new Book("태백산맥2", "조정래");
        library2[2] = new Book("태백산맥3", "조정래");
        library2[3] = new Book("태백산맥4", "조정래");
        library2[4] = new Book("태백산맥5", "조정래");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for(int i = 0; i< library2.length; i++) {
            copyLibrary[i].setTitle(library2[i].getTitle());
            copyLibrary[i].setAuthor(library2[i].getAuthor());
        }


        library2[0].setTitle("나목");
        library2[0].setAuthor("박완서");

        System.out.println("======library=========");
        for( Book book : library2) {
            book.showBookInfos();
        }

        System.out.println("======copy library=========");
        for( Book book : copyLibrary) {
            book.showBookInfos();
        }
    }
}

