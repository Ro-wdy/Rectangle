public class Rectangle {
    private double width;
    private double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

public static void main(String[] args) {
    // TODO Auto-generated method stub
     Rectangle rect = new Rectangle(7, 12);

        // Calculating and displaying the area
        System.out.println("Area of the rectangle: " + rect.calculateArea());

        // Calculating and displaying the perimeter
        System.out.println("Perimeter of the rectangle: " + rect.calculatePerimeter());
}

}
