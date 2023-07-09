import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Küçük Prens", 96, "Antoine de Saint-Exupery", "1943");
        Book book2 = new Book("Simyacı", 184, "Paulo Coelho", "1988");
        Book book3 = new Book("Yüzyıllık Yalnızlık", 464, "Gabriel García Márquez", "1967");
        Book book4 = new Book("Hayvan Çiftliği", 152, "George Orwell", "1945");
        Book book5 = new Book("Dönüşüm", 104, "Franz Kafka", "1915");

        System.out.println("\n##### Kitabın Adına Göre Alfabetik Olarak Sıralanmış Liste #####");
        Set<Book> bookOrderByTitle = new TreeSet<>();
        bookOrderByTitle.add(book1);
        bookOrderByTitle.add(book2);
        bookOrderByTitle.add(book3);
        bookOrderByTitle.add(book4);
        bookOrderByTitle.add(book5);

        for (Book book : bookOrderByTitle) {
            System.out.println(book.getTitle());
        }

        System.out.println("\n##### Kitabın Sayfa Sayısına Göre Sıralanmış Liste #####");
        Set<Book> bookOrderByPageNumber = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        bookOrderByPageNumber.add(book1);
        bookOrderByPageNumber.add(book2);
        bookOrderByPageNumber.add(book3);
        bookOrderByPageNumber.add(book4);
        bookOrderByPageNumber.add(book5);

        for (Book book : bookOrderByPageNumber) {
            System.out.println(book.getTitle() + ", Sayfa Sayısı: " + book.getPageNumber());
        }
    }
}
