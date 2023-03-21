public class Main {
    public static void main(String[] args) {
        Shape circle= new Circle(5);
        Shape rectangle =new Rectangle(4,6);
        circle.Perimeter();
        circle.Area();
        rectangle.Area();
        rectangle.Perimeter();

            /*
            Circumference from circle : 31.400000000000002
            Area from circle : 78.5
            Area from rectangle : 24
            Perimeter from rectangle :20
         */

    }
}