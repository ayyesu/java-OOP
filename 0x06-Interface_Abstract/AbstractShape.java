interface Shape {
    double getArea();
    double getPerimeter();
}

abstract class AbstractShape implements Shape {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
