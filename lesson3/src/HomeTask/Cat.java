package HomeTask;

public class Cat extends Animal{
    final String название = "Кошка";
    private String eyeColor = "Желтые";

    private String name;

    public Cat(String name, String food, String location) {
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

    public String getEyeColor() {
        return eyeColor;
    }
}
