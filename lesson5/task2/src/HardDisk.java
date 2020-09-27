public class HardDisk {
    private String vendor;
    private int size;
    private HardDiskType hardDiskType;
    private double formFactor;

    public HardDisk(String vendor, int size, HardDiskType hardDiskType, double formFactor) {
        this.vendor = vendor;
        this.size = size;
        this.hardDiskType = hardDiskType;
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                vendor + " / " +
                size + " / " +
                hardDiskType + " / " +
                formFactor + "}";
    }
}
