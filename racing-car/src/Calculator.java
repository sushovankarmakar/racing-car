import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Calculator {

    public Car calculateWinner(List<Team> teams, List<Car> cars, Map<String, List<Part>> partsMap) {
        Comparator<Part> compareBySpeedBoostPerPrice = Comparator.comparing(Part::getPricePerSpeedBoost);
        for (Team team : teams) {
            long fund = team.getFund();

            for (String carId : team.getCars()) {
                for (Car car : cars) {
                    if (car.getCarId().equals(carId)) {
                        String partListId = car.getPartListId();
                        List<Part> list = partsMap.get(partListId);
                        list.sort(compareBySpeedBoostPerPrice);

                        int baseSpeed = car.getBaseSpeed();
                        int topSpeed = car.getTopSpeed();
                        long fundSpent = car.getFundsSpentForSpeedBoosting();

                        car.setPartsUsedForBoosting(new LinkedList<>());
                        for (Part part : list) {

                            if (fund > part.getPrice() && (baseSpeed + part.getSpeedBoost()) <= topSpeed) {
                                fund -= part.getPrice();
                                fundSpent += part.getPrice();
                                baseSpeed +=  part.getSpeedBoost();

                                car.getPartsUsedForBoosting().add(part.getPartId());

                                /*System.out.println(part.getPartId() + " ");
                                System.out.println(part.getPrice() + " " + part.getSpeedBoost() + " " + part.getPriceParSpeedBoost());*/
                            }
                            else {
                                break;
                            }
                        }

                        car.setBoostedSpeed(baseSpeed);
                        car.setFundsSpentForSpeedBoosting(fundSpent);
                        car.setCarBelongsTo(team.getTeamName());
                    }
                }
            }
        }
        Comparator<Car> compareByBoostedSpeed = Comparator.comparing(Car::getBoostedSpeed).reversed();
        cars.sort(compareByBoostedSpeed);

        return cars.get(0);
    }
}
