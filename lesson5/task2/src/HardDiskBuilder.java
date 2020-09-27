public class HardDiskBuilder {
    private String vendor = "unknown";
    private int size = 512;
    private HardDiskType hardDiskType = HardDiskType.HDD;
    private double formFactor = 3.5;

    public HardDiskBuilder withVendor(String vendor){
        this.vendor = vendor;
        return this;
    }

    public HardDiskBuilder withSize(int size){
        this.size = size;
        return this;
    }

    public HardDiskBuilder withHardDiskType(HardDiskType hardDiskType){
        this.hardDiskType = hardDiskType;
        return this;
    }

    public HardDiskBuilder withFormFactor(double formFactor){
        this.formFactor = formFactor;
        return this;
    }

    public HardDisk build() {
        return new HardDisk(vendor, size, hardDiskType, formFactor);
    }
}
