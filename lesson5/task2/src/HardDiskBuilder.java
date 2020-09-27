public class HardDiskBuilder {
    private String vendor;
    private int size;
    private HardDiskType hardDiskType;
    private double formFactor;

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
