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
        return "Computer ("+ name +"){" +
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

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Cpu getCpu() { return cpu; }

    public void setCpu(Cpu cpu) { this.cpu = cpu; }

    public Ram getRam() { return ram; }

    public void setRam(Ram ram) { this.ram = ram; }

    public VideoCard getVideoCard() { return videoCard; }

    public void setVideoCard(VideoCard videoCard) { this.videoCard = videoCard; }

    public HardDisk getHardDisk() { return hardDisk; }

    public void setHardDisk(HardDisk hardDisk) { this.hardDisk = hardDisk; }
}
