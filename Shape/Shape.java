abstract class Shape{
    protected double dim_one;
    protected double dim_two;
    protected double dim_three;
    protected int num_sides;

    // Zero Para const
    public Shape(){
        dim_one = dim_two = dim_three=0;
        num_sides = 0;
    }

    // parameterized Const
    public Shape(double dim_one,double dim_two,double dim_three, int num_sides){
        this.dim_one =dim_one;
        this.dim_two =dim_two;
        this.dim_three =dim_three;
        this.num_sides =num_sides;
    }

    abstract public double calculateArea(); //Abstract Method
    abstract public double calculatePerimeter(); //Abstract Method
    abstract public double calculateVolume(); //Abstract Method

    public int getNumSides(){
        return num_sides;
    }
}
