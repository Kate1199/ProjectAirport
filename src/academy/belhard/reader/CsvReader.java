package academy.belhard.reader;

import java.io.IOException;
import java.util.List;

public interface CsvReader<T> {

    List<T> read() throws IOException;
}
