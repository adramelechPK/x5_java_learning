package HomeTask;

public class Dog extends Animal {
    final String название = "Собака";
    private int weight = 80;
    private String name;

    public Dog(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    @Override
    public void makeNoise() {
        System.out.println(название + " спит");
    }

    @Override
    public void eat() {
        System.out.println(название + " ест " + food);
    }

    public int getWeight() {
        return weight;
    }
}
