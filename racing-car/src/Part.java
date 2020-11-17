public class Part {
    private String partId;
    private int price;
    private int speedBoost;
    private double pricePerSpeedBoost;

    public Part() {
    }

    public Part(String partId, int price, int speedBoost) {
        this.partId = partId;
        this.price = price;
        this.speedBoost = speedBoost;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeedBoost() {
        return speedBoost;
    }

    public void setSpeedBoost(int speedBoost) {
        this.speedBoost = speedBoost;
    }

    public double getPricePerSpeedBoost() {
        return pricePerSpeedBoost;
    }

    public void setPricePerSpeedBoost(double pricePerSpeedBoost) {
        this.pricePerSpeedBoost = pricePerSpeedBoost;
    }
}
