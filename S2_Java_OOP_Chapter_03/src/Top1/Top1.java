package Top1;

public class Top1 {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new AdultBook("文学");
        books[1] = new AdultBook("考古学");
        Client client   = new Client();
        double sumPrice = client.sum(books, 30);
        System.out.println(sumPrice);
    }
}


