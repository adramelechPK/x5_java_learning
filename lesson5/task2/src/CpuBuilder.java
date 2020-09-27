public class CpuBuilder {
    private double clockFrequency = 1000;
    private byte coresQuantity = 1;
    private int cacheMemory = 512;
    private String title = "untitle", vendor = "unknown";

    public CpuBuilder withTitle(String title){
        this.title = title;
        return this;
    }

    public CpuBuilder withVendor(String vendor){
        this.vendor = vendor;
        return this;
    }

    public CpuBuilder withCacheMemory(int cacheMemory){
        this.cacheMemory = cacheMemory;
        return this;
    }

    public CpuBuilder withCoresQuantity(byte coresQuantity){
        this.coresQuantity = coresQuantity;
        return this;
    }

    public CpuBuilder withClockFrequency(double clockFrequency){
        this.clockFrequency = clockFrequency;
        return this;
    }

    public Cpu build() {
        return new Cpu(clockFrequency, coresQuantity, cacheMemory, title, vendor);
    }
}
