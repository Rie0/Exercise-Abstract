public class Book extends Product{
    private String author;

    public Book() {
    }
    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        return this.getPrice() - (this.getPrice()*0.40); //discount by 40%
    }
}
