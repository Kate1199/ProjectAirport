package academy.belhard.reader;

import academy.belhard.builder.PlaneBuilder;
import academy.belhard.entity.Plane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlaneReader implements CsvReader<Plane>{

    private String fileName;

    public PlaneReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Plane> read() throws IOException {

        List<Plane> planes = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while((line = reader.readLine()) != null) {
                planes.add(PlaneBuilder.build(line));
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return planes;
    }
}
