//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//Q1
        //Product product = new Product(); INVALID

        Book book = new Book("Book1",100.0,"Author");
        Movie movie = new Movie("Movie",100.0,"Director");

        System.out.println("Book price before: "+book.getPrice());
        System.out.println("Book price After: "+book.getDiscount());
        System.out.println("Movie price before: "+movie.getPrice());
        System.out.println("Movie price After: "+movie.getDiscount());
        System.out.println();

//Q2

        MovablePoint point = new MovablePoint(10,10,10,10);
        point.moveDown();
        point.moveUp();
        point.moveLeft();
        point.moveRight();




    }
}