public class Rectangle implements Shape{
    int sideA;
    int sideB;

    public Rectangle(int sideA,int sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }
    @Override
    public void Area() {
        System.out.println("Area from rectangle : "+sideA*sideB);
    }
    @Override
    public void Perimeter() {
        System.out.println("Perimeter from rectangle :"+2*(sideA+sideB));

    }
}