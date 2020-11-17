import java.util.List;

public class Car {
    private String carId;
    private String carName;
    private int baseSpeed;
    private int topSpeed;
    private String partListId;
    private int boostedSpeed;
    private long fundsSpentForSpeedBoosting;
    private List<String> partsUsedForBoosting;
    private String carBelongsTo;

    public Car() {
    }

    public Car(String carId, String carName, int baseSpeed, int topSpeed, String partListId) {
        this.carId = carId;
        this.carName = carName;
        this.baseSpeed = baseSpeed;
        this.topSpeed = topSpeed;
        this.partListId = partListId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getPartListId() {
        return partListId;
    }

    public void setPartListId(String partListId) {
        this.partListId = partListId;
    }

    public int getBoostedSpeed() {
        return boostedSpeed;
    }

    public void setBoostedSpeed(int boostedSpeed) {
        this.boostedSpeed = boostedSpeed;
    }

    public long getFundsSpentForSpeedBoosting() {
        return fundsSpentForSpeedBoosting;
    }

    public void setFundsSpentForSpeedBoosting(long fundsSpentForSpeedBoosting) {
        this.fundsSpentForSpeedBoosting = fundsSpentForSpeedBoosting;
    }

    public List<String> getPartsUsedForBoosting() {
        return partsUsedForBoosting;
    }

    public void setPartsUsedForBoosting(List<String> partsUsedForBoosting) {
        this.partsUsedForBoosting = partsUsedForBoosting;
    }

    public String getCarBelongsTo() {
        return carBelongsTo;
    }

    public void setCarBelongsTo(String carBelongsTo) {
        this.carBelongsTo = carBelongsTo;
    }
}
