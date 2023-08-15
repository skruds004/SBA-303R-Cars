package cars;

public class Car {
    int speed;
    double regularPrice;
    String color;
    public Car(int speed, double regularPrice, String color) {
        //negative speed and positive speed are the same
        this.speed = Math.abs(speed);
        this.regularPrice = regularPrice;
        this.color = color;
    }

    double getSalePrice() {
        return regularPrice;
    }
}
