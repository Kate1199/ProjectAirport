package academy.belhard.entity;

public class Result {

    private String flightNumber;
    private String dateOfFlight;
    private String timeOfFlight;
    private String tailNumber;
    private String markAndModel;
    private int passengers;
    private String fullName;
    private String kodAndRang;

    public Result(String flightNumber, String dateOfFlight, String timeOfFlight, String tailNumber,
                  String markAndModel, int passengers, String fullName, String kodAndRang) {
        this.flightNumber = flightNumber;
        this.dateOfFlight = dateOfFlight;
        this.timeOfFlight = timeOfFlight;
        this.tailNumber = tailNumber;
        this.markAndModel = markAndModel;
        this.passengers = passengers;
        this.fullName = fullName;
        this.kodAndRang = kodAndRang;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public String getTimeOfFlight() {
        return timeOfFlight;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public String getMarkAndModel() {
        return markAndModel;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getFullName() {
        return fullName;
    }

    public String getKodAndRang() {
        return kodAndRang;
    }

    @Override
    public String toString() {
        return  "Рейс № " + flightNumber +
                ", дата " + dateOfFlight +
                ", время " + timeOfFlight +
                ", бортовой номер: " + tailNumber +
                ", марка и модель самолёта: " + markAndModel +
                ", вместимость: " + passengers + " чел." +
                ", имя пилота: " + fullName +
                ", код и ранг пилота: " + kodAndRang + "\n";
    }
}
