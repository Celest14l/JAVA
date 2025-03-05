
## Class and Method Details

### `Shape.java` (Abstract Class)
- **Attributes**: `dim_one`, `dim_two`, `dim_three` (dimensions), `num_sides` (number of sides).
- **`Shape()`**: Default constructor, initializes dimensions and sides to 0.
- **`Shape(double dim_one, double dim_two, double dim_three, int num_sides)`**: Parameterized constructor.
- **`abstract calculateArea()`**: Abstract method for area calculation.
- **`abstract calculatePerimeter()`**: Abstract method for perimeter calculation.
- **`abstract calculateVolume()`**: Abstract method for volume calculation (returns 0 if not applicable).
- **`getNumSides()`**: Returns the number of sides.

### `Pyramid.java`
- **`Pyramid(double length)`**: Constructor, sets base length and height (0.87 * length) with 4 sides.
- **`calculateArea()`**: Returns base area + lateral area: `(dim_one * dim_one) + (2 * dim_two * dim_one)`.
- **`calculatePerimeter()`**: Returns base perimeter: `4 * dim_one`.
- **`calculateVolume()`**: Returns volume: `0.33 * (dim_one * dim_one) * (0.87 * dim_one)`.

### `Rectangle.java`
- **`Rectangle(double length, double width)`**: Constructor, sets length and width with 4 sides.
- **`calculateArea()`**: Returns `dim_one * dim_two`.
- **`calculatePerimeter()`**: Returns `2 * (dim_one + dim_two)`.

### `Circle.java`
- **`Circle(double radius)`**: Constructor, sets radius with 0 sides.
- **`calculateArea()`**: Returns `Math.PI * dim_one * dim_one`.
- **`calculatePerimeter()`**: Returns circumference: `2 * Math.PI * dim_one`.

### `Main.java`
- **`main(String[] args)`**: Entry point, uses `Scanner` for input and demonstrates shape calculations.

## Notes
- The `Pyramid` class assumes a square-based pyramid with a height approximated as `0.87 * base_length`. Modify `dim_two` in the constructor for different pyramid types.
- `Rectangle` and `Circle` sections in `Main.java` are commented out by default. Uncomment them to enable full functionality.
- `calculateVolume()` is implemented only for `Pyramid`; for `Rectangle` and `Circle`, it inherited from `Shape` returns 0 (not overridden).

## Contributing
Feel free to fork this project, add more shapes (e.g., `Triangle`, `Cube`), or enhance functionality (e.g., input validation). Submit pull requests with your improvements!
