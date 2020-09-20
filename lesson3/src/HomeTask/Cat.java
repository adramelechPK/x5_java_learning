package HomeTask;

public class Cat extends Animal{
    final String название = "Кошка";
    String eyeColor = "Желтые";

    @Override
    public void makeNoise() {
        System.out.println(название + " спит");
    }

    @Override
    public void eat() {
        System.out.println(название + " ест " + food);
    }
}
