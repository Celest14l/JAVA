import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of Pyramid : ");
        double length = Double.parseDouble(scan.nextLine());

        Shape pyramid = new Pyramid(length);
        System.out.println("----------------------");
        System.out.println("Area of Pyramid : " +pyramid.calculateArea());
        System.out.println("Perimeter of Pyramid : " +pyramid.calculatePerimeter());
        System.out.println("Volume of Pyramid : " +pyramid.calculateVolume());
        //System.out.println("Sides of Rectangle : " +circle.getNumSides());
        System.out.println("----------------------");

        /*System.out.println("Enter length of Rectangle : ");
        double length = Double.parseDouble(scan.nextLine());
        System.out.println("Enter Width of Rectangle : ");
        double width = Double.parseDouble(scan.nextLine());

        Shape rectangle = new Rectangle(length, width);
        System.out.println("----------------------");
        System.out.println("Area of Rectangle : " +rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle : " +rectangle.calculatePerimeter());
        System.out.println("Sides of Rectangle : " +rectangle.getNumSides());
        System.out.println("----------------------");

        System.out.println("Enter Radius of Circle : ");
        double radius = Double.parseDouble(scan.nextLine());

        Shape circle = new Circle(radius);
        System.out.println("----------------------");
        System.out.println("Area of Rectangle : " +circle.calculateArea());
        System.out.println("Perimeter of Rectangle : " +circle.calculatePerimeter());
        System.out.println("Sides of Rectangle : " +circle.getNumSides());
        System.out.println("----------------------");*/
    }
}