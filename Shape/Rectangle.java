class Rectangle extends Shape{
    //Const of rect
    public Rectangle(double length, double width){
        super(length,width,0,4);// SUPER : helps to call parameterized const of shape
    }

    public double calculateArea(){
        return dim_one*dim_two;
    }
    public double calculatePerimeter(){
        return 2*(dim_one+dim_two);
    }
}