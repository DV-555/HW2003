public class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void Area() {
        System.out.println("Area from circle : "+radius*radius*3.14);
    }



    @Override
    public void Perimeter() {
        System.out.println("Circumference from circle : "+2*3.14*radius);

    }
}