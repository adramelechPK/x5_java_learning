package HomeTask;

public class Horse extends Animal {
    final String название = "Лошадь";
    int age = 20;

    @Override
    public void makeNoise() {
        System.out.println(название + " спит");
    }

    @Override
    public void eat() {
        System.out.println(название + " жует " + food);
    }
}
