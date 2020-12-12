public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter and the philosopher's stone",399 , "Fantasy");
        Book book2 = new Book("Shards of honor", 320,"Science fiction");
        Book book3 = new Book("Zero",0,"Zero");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        book1.Weight();
        book2.Weight();
        book3.Weight();
    }
}

