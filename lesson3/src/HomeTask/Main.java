package HomeTask;

public class Main {
    public static void main(String[] args) {
        taskPhone();

        taskAnimal();

        taskStudent();
    }

    public static void taskPhone() {
        Phone samsung = new Phone(688693, "samsung", 80);
        Phone xiaomi = new Phone(323232, "xiaomi", 70);
        Phone lg = new Phone(133131, "lg", 100);

        samsung.getAll();
        xiaomi.getAll();
        lg.getAll();

        samsung.getNumber();
        samsung.receiveCall("Вася");
        samsung.receiveCall("Вася", 888888);
        xiaomi.getNumber();
        xiaomi.receiveCall("Петя");
        xiaomi.receiveCall("Петя", 777777);
        lg.getNumber();
        lg.receiveCall("Мыкола");
        lg.receiveCall("Мыкола", 666666);

        xiaomi.sendMessage(66666, 54545, 345345);
    }

    public static void taskAnimal() {
        Animal[] animals = {new Dog("Шарик", "всё, что плохо лежит", "будка"),
                new Horse("Маруся", "овес", "поле"),
                new Cat("Пушок", "твоя пятка", "находится в суперпозиции")};

        for (Animal животина : animals) {
            Ветеринар.treatAnimal(животина);
        }
    }

    public static void taskStudent() {
        Student student1 = new Aspirant("Иван",
                "Петров",
                "Философия свеклы",
                4.5,
                "Влияние лунных затмений на посевы сахарной свеклы");
        Student student2 = new Student("Петр",
                "Иванов",
                "Философия свеклы",
                5);
        Student[] students = {student1, student2};

        for (Student student: students) {
            System.out.println(student.getScholarship());
        }
    }

}
