import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new
            ArrayList<>();

    public void addBook (Book book) {
        books.add(book);
        System.out.println("Kitap eklendi.");
    }

    public void listBooks () {
        if (books.isEmpty()) {
            System.out.println("Kütüphane boş");
         } else {
            for (Book book: books) {
                System.out.println(book);
            }
        }
    }
    public void searchBook (String keyword) {
        boolean found = false;
        for (Book book : books) {
            if
            (book.getTitle().toLowerCase(). contains (keyword.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aranan kitap bulunamadı");
        }
    }
    public void removeBook (String title) {
        boolean removed =
                books.removeIf (book ->
        book.getTitle(). equalsIgnoreCase (title));
        if (removed) {
            System.out.println("Kitap silindi");
        } else {
            System.out.println("Silinecek kitap bulunamadı");
        }

    }
}
