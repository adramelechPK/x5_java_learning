public class Computer {
    private String name;
    private Cpu cpu;
    private Ram ram;
    private VideoCard videoCard;
    private HardDisk hardDisk;

    public Computer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                cpu + "; " +
                ram + "; " +
                videoCard + "; " +
                hardDisk + "}";
    }

    public void save() {
        System.out.println("сохранил конфигурацию");
    }

    public static Computer load() {
        Computer computer= new Computer("First");
        System.out.println("загрузил конфигурацю: " + computer.name);
        return computer;
    }
}
