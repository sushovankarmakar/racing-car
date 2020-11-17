import java.util.*;

public class Main {

    public static void main(String[] args) {
        String filepath = "C:\\Crio\\officialkarmakar-racing-car\\input-files\\";
        InputReaders inputReaders = new InputReaders();
        String teamsFileName = filepath + "Teams.csv";
        List<Team> teams = inputReaders.getTeams(teamsFileName);
        String carsFileName = filepath + "Cars.csv";
        List<Car> cars = inputReaders.getCars(carsFileName);
        String partsFileName = filepath + "Parts.csv";
        Map<String, List<Part>> partsMap = inputReaders.getParts(partsFileName);

        Calculator calculator = new Calculator();
        Car winningCar = calculator.calculateWinner(teams, cars, partsMap);

        String team = winningCar.getCarBelongsTo();
        String modelName = winningCar.getCarName();
        int speedAchieved = winningCar.getBoostedSpeed();
        long fundsSpent = winningCar.getFundsSpentForSpeedBoosting();
        List<String> partsUsedForBoosting = winningCar.getPartsUsedForBoosting();

        System.out.println("Winner");
        System.out.println("======");
        System.out.println("Team : " + team);
        System.out.println("Car : " + modelName);
        System.out.println("Speed achieved : " + speedAchieved);
        System.out.println("Funds spent : " + fundsSpent);
        System.out.println("Parts : " + partsUsedForBoosting);
    }
}
