package ua.lviv.iot.algo.part1.lab1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StoneWriter {
    private static final String CSV_SEPARATOR = ",";

    public void writeToFile(List<Stone> stones, String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        writer.append("Name");
        writer.append(CSV_SEPARATOR);
        writer.append("Color");
        writer.append(CSV_SEPARATOR);
        writer.append("Weight");
        writer.append(CSV_SEPARATOR);
        writer.append("Cost");
        writer.append(CSV_SEPARATOR);
        writer.append("Full Price");
        writer.append('\n');

        for (Stone stone : stones) {
            writer.append(stone.getName());
            writer.append(CSV_SEPARATOR);
            writer.append(stone.getColor());
            writer.append(CSV_SEPARATOR);
            writer.append(Double.toString(stone.getWeight()));
            writer.append(CSV_SEPARATOR);
            writer.append(Double.toString(stone.getCost()));
            writer.append(CSV_SEPARATOR);
            writer.append(Float.toString(stone.getFullPrice()));
            writer.append('\n');
            
        }
        writer.flush();
        writer.close();
    }
}
