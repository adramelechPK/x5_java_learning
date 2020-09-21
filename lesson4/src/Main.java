public class Main {
    public static void main(String[] args) {
        homeTask1();
        homeTask2();
    }

    public static void homeTask1() {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle();
        shape[1] = new Circle();
        shape[2] = new Rectangle();
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }

    public static void homeTask2() {
        Car lorry = new Lorry("Volvo", 10000, 5000);
        lorry.motor.setVendor("Volvo");
        lorry.motor.setCapacity(500);
        Car sportCar = new SportCar("Ferrari", 1500, 400);
        sportCar.motor.setVendor("Ferrari");
        sportCar.motor.setCapacity(1500);

        Car[] cars = {lorry,sportCar};

        for (Car car : cars) {
            car.printInfo();
        }

    }
}

