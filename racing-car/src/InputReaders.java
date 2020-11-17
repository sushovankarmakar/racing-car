import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class InputReaders {

    private String line = "";
    private String delimiter = ",";

    public Map<String, List<Part>> getParts(String fileName) {
        Map<String, List<Part>> partsMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                if (line.contains("part_list_id") || line.contains("part_id") || line.contains("price") || line.contains("speed_boost")) {
                    continue;   // skip the first line of the csv file.
                }
                String[] partsDetails = line.split(delimiter);
                Part part = new Part(partsDetails[1], Integer.parseInt(partsDetails[2]), Integer.parseInt(partsDetails[3]));
                part.setPricePerSpeedBoost((double) part.getPrice() / part.getSpeedBoost());
                if (partsMap.get(partsDetails[0]) == null) {
                    List<Part> listOfPart = new LinkedList<>();
                    partsMap.put(partsDetails[0], listOfPart);
                }
                partsMap.get(partsDetails[0]).add(part);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return partsMap;
    }

    public List<Car> getCars(String fileName) {
        List<Car> cars = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                if (line.contains("car_id") || line.contains("car_name") || line.contains("base_speed") ||
                        line.contains("top_speed") || line.contains("part_list_id")) {
                    continue;   // skip the first line of the csv file.
                }
                String[] carDetails = line.split(delimiter);

                Car car = new Car(carDetails[0], carDetails[1], Integer.parseInt(carDetails[2]),
                        Integer.parseInt(carDetails[3]), carDetails[4]);
                cars.add(car);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return cars;
    }

    public List<Team> getTeams(String fileName) {
        List<Team> teams = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                if (line.contains("team_id") || line.contains("team_name") || line.contains("cars") || line.contains("funds")) {
                    continue;   // skip the first line of the csv file.
                }
                String[] teamDetails = line.split(delimiter);
                int teamId = Integer.parseInt(teamDetails[0]);

                if (teamId >= teams.size() || teams.get(teamId) == null) {
                    Team team = new Team();
                    team.setTeamId(teamId);
                    team.setTeamName(teamDetails[1]);
                    if (team.getCars() == null) {
                        team.setCars(new LinkedList<>());
                    }
                    team.getCars().add(teamDetails[2]);
                    team.setFund(Long.parseLong(teamDetails[3]));

                    teams.add(team);
                } else {
                    teams.get(teamId).getCars().add(teamDetails[2]);
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return teams;
    }
}
