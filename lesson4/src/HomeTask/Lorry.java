package HomeTask;

public class Lorry extends Car {
    private final String NAME = "Грузовик";
    int weightOnBoard;

    public Lorry(String mark, int weight, int weightOnBoard) {
        super(mark, weight);
        this.weightOnBoard = weightOnBoard;
    }

    @Override
    public String start() {
        return NAME + " поехал";
    }

    @Override
    public String stop() {
        return NAME + " остановился";
    }

    @Override
    public void printInfo() {
        System.out.println("Марка авто: " + super.getMark());
        System.out.println("Класс авто: " + getNAME());
        System.out.println("Вес авто: " + super.getWeight());
        System.out.println("Производитель двигателя: " + motor.getVendor());
        System.out.println("Мощность двигателя: " + motor.getCapacity());
        System.out.println("Особенность: большая грузоподъемность (" + getWeightOnBoard() + " кг)");
    }

    public int getWeightOnBoard() {
        return weightOnBoard;
    }

    public void setWeightOnBoard(int weightOnBoard) {
        this.weightOnBoard = weightOnBoard;
    }

    public String getNAME() {
        return NAME;
    }
}
