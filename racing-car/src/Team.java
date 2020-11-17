import java.util.List;

public class Team {
    private int teamId;
    private String teamName;
    private List<String> cars;
    private long fund;

    public Team () {

    }

    public Team(int teamId, String teamName, List<String> cars, long fund) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.cars = cars;
        this.fund = fund;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<String> getCars() {
        return cars;
    }

    public long getFund() {
        return fund;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public void setFund(long fund) {
        this.fund = fund;
    }
}
