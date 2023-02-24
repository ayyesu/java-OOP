class Circle extends AbstractShape {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle: radius = " + radius +
                ", color = " + getColor() + ", area = " + getArea() +
                ", perimeter = " + getPerimeter();
    }
}
