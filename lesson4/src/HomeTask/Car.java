package HomeTask;

public abstract class Car {
    String mark, klass;
    int weight;
    Engine motor = new Engine();

    public Car(String mark, String klass, int weight) {
        this.mark = mark;
        this.klass = klass;
        this.weight = weight;
    }

    public Car(String mark, int weight) {
        this.mark = mark;
        this.weight = weight;
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public abstract String start();

    public abstract String stop();

    public abstract void printInfo();

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }
}
