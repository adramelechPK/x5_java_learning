public class Ram {
    private String vendor;
    private int size;
    private double frequency;
    private RamType ramType;

    public Ram(String vendor, int size, double frequency, RamType ramType) {
        this.vendor = vendor;
        this.size = size;
        this.frequency = frequency;
        this.ramType = ramType;
    }

    @Override
    public String toString() {
        return "RAM{" + vendor + " / " +
                size + " / " +
                frequency + " / " +
                ramType + "}";
    }

    public String getVendor() { return vendor; }

    public void setVendor(String vendor) { this.vendor = vendor; }

    public int getSize() { return size; }

    public void setSize(int size) { this.size = size; }

    public double getFrequency() { return frequency; }

    public void setFrequency(double frequency) { this.frequency = frequency; }

    public RamType getRamType() { return ramType; }

    public void setRamType(RamType ramType) { this.ramType = ramType; }
}
