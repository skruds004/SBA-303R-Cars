package cars;

public class Truck extends Car{
    int weight;
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        //if the weight is over 2000lbs, 10% discount
        if(this.weight > 2000) {
            return this.regularPrice*.9;
        }
        //20% discount otherwise
        else {
            return this.regularPrice*.8;
        }
    }

    void salesPitch() {
        System.out.println(
                "This " + this.color + " Truck weighs " + this.weight
                        + "lbs and costs just $" +
                        String.format("%.2f",this.getSalePrice())
        );
    }
}
