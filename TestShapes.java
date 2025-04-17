public class TestShape {
    public static void main(String[] args) {

        Shape square = new Rectangle( "blue", 3,4);
        Rectangle rectangle = new Rectangle("white",3,4);
        rectangle.describe();
        Rectangle r1 = new Rectangle("blue", 3,4);
        Rectangle r2 = new Rectangle("blue", 3,4);
        System.out.println(r1.equals(r2));


    }
}
