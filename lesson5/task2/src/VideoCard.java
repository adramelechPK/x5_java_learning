public class VideoCard {
    private String vendor;
    private VideoCardType videoCardType;
    private int size;
    private VideoCardCoolingType videoCardCoolingType;

    public VideoCard(String vendor, VideoCardType videoCardType, int size, VideoCardCoolingType videoCardCoolingType) {
        this.vendor = vendor;
        this.videoCardType = videoCardType;
        this.size = size;
        this.videoCardCoolingType = videoCardCoolingType;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                vendor + " / " +
                videoCardType + " / " +
                size + " / " +
                videoCardCoolingType + "}";
    }

    public String getVendor() { return vendor; }

    public void setVendor(String vendor) { this.vendor = vendor; }

    public VideoCardType getVideoCardType() { return videoCardType; }

    public void setVideoCardType(VideoCardType videoCardType) { this.videoCardType = videoCardType; }

    public int getSize() { return size; }

    public void setSize(int size) { this.size = size; }

    public VideoCardCoolingType getVideoCardCoolingType() { return videoCardCoolingType; }

    public void setVideoCardCoolingType(VideoCardCoolingType videoCardCoolingType) { this.videoCardCoolingType = videoCardCoolingType; }
}
