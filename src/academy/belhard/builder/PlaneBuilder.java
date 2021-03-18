package academy.belhard.builder;

import academy.belhard.entity.Plane;

public class PlaneBuilder {

    public static Plane build(String str) {
        String[] line = str.split(CsvDelimetr.DELIMETR);

        Plane plane = new Plane(Integer.parseInt(line[0]), line[1], line[2], Integer.parseInt(line[3]), line[4]);
        return plane;
    }
}
