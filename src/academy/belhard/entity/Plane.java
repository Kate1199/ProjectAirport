package academy.belhard.entity;

public class Planes {

    private int id;
    private String mark;
    private String model;
    private int passengers;
    private String tailNumber;

    public Planes(int id, String mark, String model, int passengers, String tailNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.passengers = passengers;
        this.tailNumber = tailNumber;
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getTailNumber() {
        return tailNumber;
    }
}
