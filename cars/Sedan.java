package cars;

public class Sedan extends Car{
    int length;
    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        //5% discount for a car longer than 20 feet
        if(length > 20) {
            return this.regularPrice*.95;
        }
        //10% discount otherwise
        else {
            return this.regularPrice*.9;
        }
    }

    void salesPitch() {
        System.out.println(
                "This " + this.color + " Sedan is " + this.length
                        + " feet long and costs just $" +
                        String.format("%.2f",this.getSalePrice())
        );
    }
}
