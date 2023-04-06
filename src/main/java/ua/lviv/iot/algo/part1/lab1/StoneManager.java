package ua.lviv.iot.algo.part1.lab1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StoneManager {
    private final List<Stone> stones = new ArrayList<>();
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
    public static void main(String[] args) {

        var manager = new StoneManager();

        manager.addStone(new PreciousStone("sapphire", "blue", 0.5,1000 , 1, 3, 1000));
        manager.addStone(new ArtificialPreciousStone("Lab1", 0.5f, 500));
        manager.addStone(new PreciousStone("diamond", "colorless",0.2, 2000, 2, 4, 2000));
        manager.addStone(new ArtificialPreciousStone("Lab2", 1, 1000));
        manager.addStone(new Minerals("peat", "brown", 1,10 ,"fuel ores"));
        manager.addStone(new Minerals("rock salt", "colorless", 100,1 ,"not ores"));
        manager.addStone(new KidneyStone("cystyn stone", "orange", 0.01,0 ,true));
        manager.addStone(new KidneyStone("uric stone", "grey", 0.1,0 ,false));
        double weightGreaterThan = 0.4;
        for(var stone : manager.findAllWithWeightGreaterThan(weightGreaterThan)){
            System.out.println("\nВажчі за "+ weightGreaterThan +":" + stone);
        }
        double costGreaterThan = 500;
        for(var co : manager.findAllWithCostGreaterThan(costGreaterThan)){
            System.out.println("\nДорожчі за "+ costGreaterThan +":" + co);
        }
    }
}
