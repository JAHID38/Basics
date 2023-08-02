package solid.lsp;
abstract class Shape{
    double area(){
        return -1;
    }
}
class Rectangle extends Shape{
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    double area() {
        return length * width;
    }
}
class Square extends Shape{
    int length;
    double area(){
        return Math.pow(length, 2);
    }
}
class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class ShapeService{
    double calculateArea(Shape shape){
        return shape.area();
    }
}
public class LiskovSubstitution {
    public static void main (String args []){
        ShapeService shapeService = new ShapeService();

        int radius = 10;
        int length = 15;
        int width = length/2;

        Circle circle = new Circle(radius);
        double circleArea = shapeService.calculateArea(circle);
        System.out.printf("Area of Circle (" +radius+ "m) : %.2f  sq m.\n", circleArea);

        Rectangle rectangle = new Rectangle(length, width);
        double rectArea = shapeService.calculateArea(rectangle);
        System.out.println("Area of Rectangle (" +length+ "m x " +width+ "m) : " +(int)rectArea + " sq m.");
    }
}
