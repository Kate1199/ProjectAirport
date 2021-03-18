package academy.belhard.resWriter;

import academy.belhard.entity.Result;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {

    public static void write(List<Result> results, String fileName) {
        try(FileWriter writer = new FileWriter(fileName)) {
            for (Result result : results) {
                writer.write(result.toString());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
