class Pyramid extends Shape {
    // Constructor for the Pyramid class
    public Pyramid(double length) {
        super(length, length * 0.87, 0, 4); // Pass values to the parent class (Shape)
    }

    public double calculateArea() {
        return (dim_one * dim_one) + (2 * dim_two * dim_one); // base area + lateral area
    }

    public double calculatePerimeter() {
        return 4 * dim_one; 
    }

    public double calculateVolume() {
        return 0.33 * (dim_one * dim_one) * (0.87 * dim_one); 
    }
}
