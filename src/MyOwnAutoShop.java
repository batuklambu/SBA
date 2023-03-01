public class MyOwnAutoShop {
    public static void main(String[] args) {

//Create an instance of the Sedan class and initialize all the fields with appropriate values.
// Use super(...) method in the constructor for initializing the fields of the superclass.

//Create two instances of the Ford class and initialize all the fields with appropriate values.
// Use super(...) method in the constructor for initializing the fields of the super class.

//Create an instance of the Car class and initialize all the fields with appropriate values.
// Display the sale prices of all instances.

    Sedan camry = new Sedan(80,30000,"Black",20);
    Ford puma =new Ford(85,35000,"Blue",2023,1500);
    Ford explorer=new Ford(90,45000,"Silver",2023,5000);
    Car acura =new Car(80,50000,"White");

        System.out.println("Sale Price of Sedan Camry  is : "+ camry.getSalePrice());
        System.out.println("Sale Price of Ford Puma is : "+ puma.getSalePrice());
        System.out.println("Sale Price of Ford Explorer is : "+ explorer.getSalePrice());
        System.out.println("Sale Price of Car Acura is : "+ acura.getSalePrice());





    }
}
