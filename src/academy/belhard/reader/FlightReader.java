package academy.belhard.reader;

import academy.belhard.builder.FlightBuilder;
import academy.belhard.entity.Flight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightReader implements CsvReader<Flight>{

    private String fileName;

    public FlightReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Flight> read() throws IOException {

        List<Flight> flights = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = reader.readLine()) != null) {
                flights.add(FlightBuilder.build(line));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return flights;
    }
}
