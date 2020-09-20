package HomeTask;

public class Dog extends Animal {
    final String название = "Собака";
    int weight = 80;

    @Override
    public void makeNoise() {
        System.out.println(название + " спит");
    }

    @Override
    public void eat() {
        System.out.println(название + " ест " + food);
    }
}
