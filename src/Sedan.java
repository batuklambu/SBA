public class Sedan extends Car {

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    int length;

    public Sedan(int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
    }

//double getSalePrice(); // for this method implement this: If length>20 feet, 5%discount, Otherwise, 10%discount


    @Override
    double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95;
        } else {
            return regularPrice * 0.90;
        }

    }

}
