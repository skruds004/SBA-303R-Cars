package cars;

public class Ford extends Car{
    int year;
    int manufacturerDiscount;
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    //subtract the manufacturer discount from the regular price
    double getSalePrice() {
        return this.regularPrice-this.manufacturerDiscount;
    }

    void salesPitch() {
        System.out.println(
                "This " + this.color + " Ford was made in " + this.year
                        + " and costs just $" +
                        String.format("%.2f",this.getSalePrice())
        );
    }
}
