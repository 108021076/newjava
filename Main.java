/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setCover("JOJO");
        System.out.println(book1.getCover());
        book1.setTitle("oraoraoraoraoraora");
        System.out.println(book1.getTitle());
        book1.setContent("zawarudo");
        System.out.println(book1.getContent());
    }
}