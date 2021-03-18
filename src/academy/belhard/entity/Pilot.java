package academy.belhard.entity;

public class Pilot {
    private int id;
    private String firstName;
    private String lastName;
    private String rang;
    private String pilotKod;

    public Pilot(int id, String firstName, String lastName, String rang, String pilotKod) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rang = rang;
        this.pilotKod = pilotKod;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRang() {
        return rang;
    }

    public String getPilotKod() {
        return pilotKod;
    }
}
