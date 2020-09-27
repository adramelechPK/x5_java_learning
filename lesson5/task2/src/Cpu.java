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

    public boolean checkCpuForm() {
        boolean flag = true;
        String notice = "CPU fields are empty: ";
        if (clockFrequency == 0) {
            notice += "clockFrequency; ";
            flag = false;
        }

        if (coresQuantity == 0) {
            notice += "coresQuantity; ";
            flag = false;
        }

        if (cacheMemory == 0 ) {
            notice += "cacheMemory; ";
            flag = false;
        }

        if (title == null ) {
            notice += "title; ";
            flag = false;
        }

        if (vendor == null ) {
            notice += "vendor; ";
            flag = false;
        }
        System.out.println(notice);
        return flag;
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
