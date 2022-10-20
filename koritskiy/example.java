class Transport {
    private String brand;
    private String color;
    private int price;
    private int power;
    private int maxPassengers;
    private int speed;

    public Transport(String brand, String color, int price, int power, int maxPassengers, int speed) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.power = power;
        this.maxPassengers = maxPassengers;
        this.speed = speed;
    }

    public void getInfo() {
        System.out.println("Transport!");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Power: " + power);
    }
}

class Car extends Transport {
    private int trunkWeight;
    private boolean isRoofExist;
    private boolean isColumnExist;

    public Car(String brand, String color, int price, int power, int maxPassengers, int speed,
               int trunkWeight, boolean isRoofExist, boolean isColumnExist) {
        super(brand, color, price, power, maxPassengers, speed);

        this.trunkWeight = trunkWeight;
        this.isRoofExist = isRoofExist;
        this.isColumnExist = isColumnExist;
    }

    @Override
    public void getInfo() {
        super.getInfo();

        System.out.println("Car!");
        System.out.println("Trunk weight: " + trunkWeight);
    }
}

class Plane {

}

public class Main {
    public static void main(String[] args) {
        // Создание объекта без подвоха
        Car car = new Car("BMW", "black", 1000000, 249, 5, 250,
                30, false, true);
        car.getInfo();

        // Создание объекта с подвохом
        Transport newCar = new Car("Mercedes", "pink", 1000000, 249, 5, 250,
                30, false, true);
        newCar.getInfo();

        Transport transport = new Transport("Mercedes", "pink", 1000000, 249, 5, 250);
        transport.getInfo();

        // Ошибочное объявление
//        Transport plane = new Plane();
    }
}