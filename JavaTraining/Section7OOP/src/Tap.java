public class Tap {

    private boolean hotWater;
    private boolean coldWater;
    private boolean isWaterOn;

    public boolean isHotWater() {
        return hotWater;
    }

    public boolean isColdWater() {
        return coldWater;
    }

    public boolean isWaterOn() {
        return isWaterOn;
    }

    public void setHotWater(boolean hotWater) {
        this.hotWater = hotWater;
    }

    public void setColdWater(boolean coldWater) {
        this.coldWater = coldWater;
    }

    public void setWaterOn(boolean waterOn) {
        this.isWaterOn = waterOn;
    }

    public Tap(boolean hotWater, boolean coldWater, boolean isWaterOn) {
        this.hotWater = hotWater;
        this.coldWater = coldWater;
        this.isWaterOn = isWaterOn;
    }
}
