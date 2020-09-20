package HomeTask;

public class Horse extends Animal {
    final String название = "Лошадь";
    private int age = 20;

    private String name;

    public Horse(String name, String food, String location) {
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
        System.out.println(название + " жует " + food);
    }

    public int getAge() {
        return age;
    }
}
