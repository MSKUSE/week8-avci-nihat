public class Shape {



    private String color ="white";
    public  Shape(){}

    private double area (){
        return 0.0;
    }
    private double perimeter(){
        return 0.0;
    }


    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void describe(){
        System.out.println("This is a shape and colour is" + this.color);
    }
    /*
    public void describe(int sideA, int sideB){
        System.out.println("Side a is "+ sideA + "Side b is "+ sideB);
    }
    public void describe(int sideA){
        System.out.println("Side a is "+ sideA);
    }

    public void describe (double sideA){
        System.out.println("Radius is" + sideA);
    }

     */
}
