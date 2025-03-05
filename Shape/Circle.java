import java.lang.*;
class Circle extends Shape{
    //Const 
    public Circle(double radius){
        super(radius,0,0,0);// SUPER : helps to call parameterized const of shape
    }

    public double calculateArea(){
        return Math.PI*dim_one*dim_one;
    }
    public double calculatePerimeter(){
        return 2*dim_one*Math.PI;
    }
}