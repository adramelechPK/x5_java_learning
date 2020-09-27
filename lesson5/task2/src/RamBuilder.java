public class RamBuilder {
    private String vendor = "unknown";
    private int size = 2;
    private double frequency = 1333;
    private RamType ramType = RamType.DDR2;

    public RamBuilder withVendor(String vendor){
        this.vendor = vendor;
        return this;
    }

    public RamBuilder withSize(int size){
        this.size = size;
        return this;
    }

    public RamBuilder withFrequency(double frequency){
        this.frequency = frequency;
        return this;
    }

    public RamBuilder withRamType(RamType ramType){
        this.ramType = ramType;
        return this;
    }

    public Ram build() {
        return new Ram(vendor, size, frequency, ramType);
    }
}
