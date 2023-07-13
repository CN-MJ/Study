package Top1;

class AdultBook extends Book {
    public AdultBook(){}
    public AdultBook(String name){
        super(name, 45);
    }

    @Override
    public int calFines(int borrwingDays) {
        int price;
        int days = borrwingDays-super.getBorrwingDays();
        if (days<21){
            price = 0;
        }else if (days > 0 && days <= 3){
            price = days * 2;
        }else {
            price = 6+(days-3)*5;
        }

        return price;
    }
}