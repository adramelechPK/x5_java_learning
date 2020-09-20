package HomeTask;

import java.util.Arrays;

public class Phone {
    private int number, weight;
    private String model;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + "(" + number + ")");
    }

    public void sendMessage(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public int getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public void getAll() {
        System.out.println("Модель: " + getModel() + "\nНомер: " + getNumber() + "\nВес: " + getWeight());
    }
}
