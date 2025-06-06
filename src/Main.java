import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner scanner = new
                Scanner(System.in);
                Library library = new Library();
                int choice;

                do {
                    System.out.println(" Kütüphane Yönetimi ");
                    System.out.println(" 1. Kitap ekle ");
                    System.out.println(" 2. Kitapları listele ");
                    System.out.println(" 3. Kitap ara ");
                    System.out.println(" 4. Kitap sil ");
                    System.out.println(" 5. Çıkış ");
                    System.out.println("Seçiminiz: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                        System.out.println("Kitap adı: ");
                        String title =
                                scanner.nextLine();
                        System.out.println("Yazar: ");
                        String author =
                                scanner.nextLine();
                        System.out.println("Yıl: ");
                        int year =
                                scanner.nextInt();
                        scanner.nextLine();
                        library.addBook(new Book(title, author, year));
                        break;
                        case 2:
                            library.listBooks();
                            break;
                        case 3:
                            System.out.println("Aranacak kelime: ");
                            String keyword =
                                    scanner.nextLine();
                            library.searchBook(keyword);
                            break;
                        case 4:
                            System.out.println("Silinecek kitap adı: ");
                            String removeTitle=
                                    scanner.nextLine();
                            library.removeBook(removeTitle);
                            break;
                        case 5:
                            System.out.println("Çıkılıyor... ");
                            break;
                        default:
                            System.out.println("Geçersiz Seçim! ");

                            }




                } while (choice!=5);
                scanner.close();



    }
}