package academy.belhard;

import academy.belhard.IOdb.reader.ResultDbReader;
import academy.belhard.IOdb.writer.FlightDbWriter;
import academy.belhard.IOdb.writer.PilotDbWriter;
import academy.belhard.IOdb.writer.PlaneDbWriter;
import academy.belhard.entity.Flight;
import academy.belhard.entity.Pilot;
import academy.belhard.entity.Plane;
import academy.belhard.entity.Result;
import academy.belhard.reader.FlightReader;
import academy.belhard.reader.PilotReader;
import academy.belhard.reader.PlaneReader;
import academy.belhard.resWriter.Writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException{

        PilotReader pilotReader = new PilotReader(FileNames.pilotsFile);
        List<Pilot> pilots = new ArrayList<>();
        pilots = pilotReader.read();
        PilotDbWriter.insert(pilots);

        System.out.println();

        PlaneReader planeReader = new PlaneReader(FileNames.planesFile);
        List<Plane> planes = new ArrayList<>();
        planes = planeReader.read();
        PlaneDbWriter.insert(planes);

        System.out.println();

        FlightReader flightReader = new FlightReader(FileNames.flightsFile);
        List<Flight> flights = new ArrayList<>();
        flights = flightReader.read();
        FlightDbWriter.insert(flights);

        List<Result> results = ResultDbReader.read();
        Writer.write(results, FileNames.resultFile);

    }
}
