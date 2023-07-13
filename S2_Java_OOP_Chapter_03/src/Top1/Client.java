package Top1;
class Client{
    public double sum(Book[] books, int days){
        int sumPrice= 0;
        for (Book book : books) {
            sumPrice += new Book().calFines(days);
        }
        return sumPrice;
    }

}
