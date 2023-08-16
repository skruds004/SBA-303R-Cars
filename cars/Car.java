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

    void salesPitch() {
        //use string.format to display price to 2 decimal points
        System.out.println(
                "This " + this.color + " Car goes " + this.speed
                        + "mph and costs just $" +
                        String.format("%.2f",this.getSalePrice())
        );
    }
}
