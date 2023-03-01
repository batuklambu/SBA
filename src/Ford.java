public class Ford extends Car {


int year;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
    }

//double getSalePrice(); // for this method implement this: from the sale price computed from Car class,
// subtract the manufacturer Discount.


    @Override
    double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}
