package cars;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(50, 2000, "Green", 21);
        Ford ford1 = new Ford(2, 50000.50, "Brown", 1960, 200);
        Ford ford2 = new Ford(200, 1999.99, "Rusty", 2004, 2);
        Car car1 = new Car(600, 5.50, "Red");

        sedan1.salesPitch();
        ford1.salesPitch();
        ford2.salesPitch();
        car1.salesPitch();

}}
