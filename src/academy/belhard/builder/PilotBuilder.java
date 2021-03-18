package academy.belhard.builder;

import academy.belhard.entity.Pilot;

import java.io.IOException;

public class PilotBuilder{

    public static Pilot build(String str) {
        String[] line = str.split(CsvDelimetr.DELIMETR);

        Pilot pilot = new Pilot(Integer.parseInt(line[0]), line[1], line[2],line[3], line[4]);
        return pilot;
    }
}
