public class Car {
    private String make;
    private String model;
    private int year;
    private double speed;

    public Car(String make, String model, int year, double speed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        speed -= 7;
    }

    public static void main(String[] args) {
        Car firstCar = new Car("Toyota", "Camry", 2022, 50);
        Car secondCar = new Car("Honda", "Civic", 2021, 75);

        System.out.println("First Car:");
        System.out.println("Make: " + firstCar.getMake());
        System.out.println("Model: " + firstCar.getModel());
        System.out.println("Year: " + firstCar.getYear());
        System.out.println("Speed: " + firstCar.getSpeed());

        System.out.println("Second Car:");
        System.out.println("Make: " + secondCar.getMake());
        System.out.println("Model: " + secondCar.getModel());
        System.out.println("Year: " + secondCar.getYear());
        System.out.println("Speed: " + secondCar.getSpeed());

        firstCar.accelerate();
        System.out.println("First car accelerated. New speed: " + firstCar.getSpeed());

        secondCar.brake();
        System.out.println("Second car braked. New speed: " + secondCar.getSpeed());
    }
}



