public class RamBuilder {
    private String vendor;
    private int size;
    private double frequency;
    private RamType ramType;

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
