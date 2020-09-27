public class Cpu {
    private double clockFrequency;
    private byte coresQuantity;
    private int cacheMemory;
    private String title, vendor;

    public Cpu(double clockFrequency, byte coresQuantity, int cacheMemory, String title, String vendor) {
        this.clockFrequency = clockFrequency;
        this.coresQuantity = coresQuantity;
        this.cacheMemory = cacheMemory;
        this.title = title;
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "CPU{" + vendor + "/" +
                title + "; " +
                coresQuantity + " / " +
                clockFrequency + " / " +
                + cacheMemory +
                '}';
    }

    public double getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(double clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public byte getCoresQuantity() {
        return coresQuantity;
    }

    public void setCoresQuantity(byte coresQuantity) {
        this.coresQuantity = coresQuantity;
    }

    public int getCacheMemory() {
        return cacheMemory;
    }

    public void setCacheMemory(int cacheMemory) {
        this.cacheMemory = cacheMemory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
