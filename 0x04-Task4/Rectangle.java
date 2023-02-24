public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20.0, 10.0);
        Rectangle rectangle2 = new Rectangle(2.0, 6.0);

        System.out.println("Rectangle 1 area: " + rectangle1.getArea());
        System.out.println("Rectangle 1 perimeter: " + rectangle1.getPerimeter());

        System.out.println("Rectangle 2 area: " + rectangle2.getArea());
        System.out.println("Rectangle 2 perimeter: " + rectangle2.getPerimeter());

        rectangle1.setWidth(10.0);
        rectangle1.setHeight(20.0);

        System.out.println("Updated Rectangle 1 area: " + rectangle1.getArea());
        System.out.println("Updated Rectangle 1 perimeter: " + rectangle1.getPerimeter());
    }
}
