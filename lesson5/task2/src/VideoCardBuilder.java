public class VideoCardBuilder {
    private String vendor = "unknown";
    private VideoCardType videoCardType = VideoCardType.GDDR4;
    private int size = 4096;
    private VideoCardCoolingType videoCardCoolingType = VideoCardCoolingType.ACTIVE;

    public VideoCardBuilder withVendor(String vendor){
        this.vendor = vendor;
        return this;
    }

    public VideoCardBuilder withSize(int size){
        this.size = size;
        return this;
    }

    public VideoCardBuilder withVideoCardType(VideoCardType videoCardType){
        this.videoCardType = videoCardType;
        return this;
    }

    public VideoCardBuilder withVideoCardCoolingType(VideoCardCoolingType videoCardCoolingType){
        this.videoCardCoolingType = videoCardCoolingType;
        return this;
    }

    public VideoCard build() {
        return new VideoCard(vendor, videoCardType, size, videoCardCoolingType);
    }
}
