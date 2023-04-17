package ua.lviv.iot.algo.part1.lab1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StoneManager {
    private static final List<Stone> stones = new ArrayList<>();

    public void addStone(final Stone stone) {
        stones.add(stone);
    }

    public List<Stone> findAllWithWeightGreaterThan(double weight) {
        return stones.stream()
                .filter(stone -> stone.getWeight() > weight)
                .collect(Collectors.toList());
    }

    public List<Stone> findAllWithCostGreaterThan(double cost) {
        return stones.stream()
                .filter(stone -> stone.getCost() > cost)
                .collect(Collectors.toList());
    }

    public static void saveToCSV(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(stones.get(0).getHeaders() + "\n");

            for (Stone stone : stones) {
                writer.write(stone.toCSV() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {


        stones.add(new PreciousStone("sapphire", "blue", 0.5,1000 , 1, 3, 1000));
        stones.add(new PreciousStone("diamond", "colorless",0.2, 2000, 2, 4, 2000));
        stones.add(new Minerals("peat", "brown", 1,10 ,"fuel ores"));
        stones.add(new Minerals("rock salt", "colorless", 100,1 ,"not ores"));
        stones.add(new KidneyStone("cystyn stone", "orange", 0.01,0 ,true));
        stones.add(new KidneyStone("uric stone", "grey", 0.1,0 ,false));

        saveToCSV("file.csv");
        }
    }


