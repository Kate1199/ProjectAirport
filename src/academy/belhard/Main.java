package academy.belhard;

import academy.belhard.IOdb.reader.ResultDbReader;
import academy.belhard.entity.Result;
import academy.belhard.resWriter.Writer;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

//        PilotReader pilotReader = new PilotReader(FileNames.pilotsFile);
//        List<Pilot> pilots = new ArrayList<>();
//        pilots = pilotReader.read();
//        PilotDbWriter.insert(pilots);
//
//        System.out.println();
//
//        PlaneReader planeReader = new PlaneReader(FileNames.planesFile);
//        List<Plane> planes = new ArrayList<>();
//        planes = planeReader.read();
//        PlaneDbWriter.insert(planes);
//
//        System.out.println();
//
//        FlightReader flightReader = new FlightReader(FileNames.flightsFile);
//        List<Flight> flights = new ArrayList<>();
//        flights = flightReader.read();
//        FlightDbWriter.insert(flights);

        List<Result> results = ResultDbReader.read();
        Writer.write(results, FileNames.resultFile);
    }
}
