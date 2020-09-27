public class Main {
    public static void main(String[] args) {
        CpuBuilder cpuBuilder = new CpuBuilder();
        Cpu cpu = cpuBuilder.withTitle("i3").withVendor("intel").build();

        RamBuilder ramBuilder = new RamBuilder();
        Ram ram = ramBuilder.withVendor("Hinux").withRamType(RamType.DDR3).withSize(4096).build();

        VideoCardBuilder videoCardBuilder = new VideoCardBuilder();
        VideoCard videoCard = videoCardBuilder.withVendor("Nvidia").build();
        videoCard.setVideoCardType(VideoCardType.GDDR5);
        videoCard.setSize(4096);
        videoCard.setVideoCardCoolingType(VideoCardCoolingType.ACTIVE);

        HardDisk hardDisk = new HardDisk("Western Digital", 1024, HardDiskType.HDD, 3.5);

        Computer computer = new Computer("test");
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setRam(ram);
        computer.setVideoCard(videoCard);

        System.out.println(computer);

        if (! computer.getCpu().checkCpuForm()) {
            System.out.println("Сохранение конфигурации невозможно");
        }
    }
}
