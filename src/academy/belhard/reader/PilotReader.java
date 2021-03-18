package academy.belhard.reader;

import academy.belhard.builder.PilotBuilder;
import academy.belhard.entity.Pilot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotReader implements CsvReader<Pilot>{

    private String fileName;

    public PilotReader(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public List<Pilot> read() throws IOException {
        List<Pilot> pilots = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = null;

            while ((line = reader.readLine()) != null) {
                Pilot pilot = PilotBuilder.build(line);

                pilots.add(pilot);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return pilots;
    }
}
