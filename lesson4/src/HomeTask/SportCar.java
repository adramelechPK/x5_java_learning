package HomeTask;

public class SportCar extends Car {
    private final String NAME = "Блестящая быстрая машина (красненькая)";
    int maxSpeed;

    public SportCar(String mark, int weight, int maxSpeed) {
        super(mark, weight);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String start() {
        return NAME + " поехала";
    }

    @Override
    public String stop() {
        return NAME + " остановилась";
    }

    @Override
    public void printInfo() {
        System.out.println("Марка авто: " + super.getMark());
        System.out.println("Класс авто: " + getNAME());
        System.out.println("Вес авто: " + super.getWeight());
        System.out.println("Производитель двигателя: " + motor.getVendor());
        System.out.println("Мощность двигателя: " + motor.getCapacity());
        System.out.println("Особенность: большая максимальная скорость (" + getMaxSpeed() + " км/ч)");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getNAME() {
        return NAME;
    }
}
