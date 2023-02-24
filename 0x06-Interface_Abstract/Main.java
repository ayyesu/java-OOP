public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(30);
        rectangle1.setHeight(50);
        rectangle1.setColor("Red");

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(15);
        rectangle2.setHeight(20);
        rectangle2.setColor("Yellow");

        Circle circle1 = new Circle();
        circle1.setRadius(6);
        circle1.setColor("Green");

        Circle circle2 = new Circle();
        circle2.setRadius(9);
        circle2.setColor("Yellow");

        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
    }
}
