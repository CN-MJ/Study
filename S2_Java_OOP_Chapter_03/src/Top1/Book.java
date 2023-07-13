package Top1;
class Book {
    private String name;
    private int  borrwingDays;
    public Book(){};
    public Book(String name, int borrwingDays){
        this.name = name;
        this.borrwingDays = borrwingDays;
    }

    public String getName() {
        return name;
    }

    public int getBorrwingDays() {
        return borrwingDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBorrwingDays(int borrwingPeriod) {
        this.borrwingDays = borrwingPeriod;
    }
    public  int calFines(int borrwingDays){
        return 0;
    }
}
