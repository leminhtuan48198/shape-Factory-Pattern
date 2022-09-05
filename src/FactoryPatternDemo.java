public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory=new ShapeFactory();
        Shape s1= factory.getShape("circle");
        s1.draw();
        Shape s2= factory.getShape("rectangle");
        s2.draw();
        Shape s3= factory.getShape("square");
        s3.draw();
    }
}
